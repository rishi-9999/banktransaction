package assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankDAO {
	public int searchName(String cname, ArrayList<BankAccount> list) {
		int bool = 0;
		for (BankAccount b : list) {
			if (b.getName().equals(cname)) {
				bool = 1;
				break;
			}

		}
		return bool;
	}

	public void mapCardNumber(ArrayList<BankAccount> list1, ArrayList<BankTransactions> list2, String cname) {
		for (BankAccount ba : list1) {
			for (BankTransactions bt : list2) {
				if (ba.getName().equals(cname)) {
					if (ba.getCardNumber().equals(bt.getCardNumber())) {

						System.out.printf("%-15s%-15s%-15s%-15s%-25s\n", ba.getBankName(), ba.getAge(), ba.getGender(),
								bt.gettDate(), bt.getAmount());
						
					}
				}
			}
		}
	}
}
