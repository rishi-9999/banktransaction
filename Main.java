package com.bank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		File file1 = new File("./src/bankaccount.txt");
		File file2 = new File("./src/banktransactions.txt");
		ArrayList<BankTransactions> list2 = new ArrayList<BankTransactions>();
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
		BufferedReader br = new BufferedReader(new FileReader(file1));
		BufferedReader br1 = new BufferedReader(new FileReader(file2));
		String buffer = "";
		String sample = "";
		int i = 0;
		while ((buffer = br.readLine()) != null) {
			sample = buffer;
			String[] data = sample.split(",");
			list.add(new BankAccount(data[0], data[1], data[2], data[3], data[4], data[5]));
		}
		while ((buffer = br1.readLine()) != null) {
			sample = buffer;
			String[] data2 = sample.split(",");
			list2.add(new BankTransactions(data2[0], data2[1], data2[2]));
		}
		System.out.println("Enter the name of the customer");
		Scanner sc = new Scanner(System.in);
		String cname = sc.next();
		int found = new BankDAO().searchName(cname, list);
		if (found == 1) {
			System.out.println("Customer Name:" + cname);
			System.out.println("Transaction Details are:");
			System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Bank", "Age", "Gender", "TransactionDate", "Amount");
			new BankDAO().mapCardNumber(list, list2, cname);
		} else {
			System.out.println("Customer name not found");
		}

	}
}
