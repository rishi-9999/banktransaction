package assignment;

public class BankAccount {
	String name;
	String age;
	private BankTransactions banktransactions;
	String gender;
	String bankName;
	String cardNumber;
	String creditLimit;

	public BankAccount() {
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", age=" + age + ", banktransactions=" + banktransactions + ", gender="
				+ gender + ", bankName=" + bankName + ", cardNumber=" + cardNumber + ", creditLimit=" + creditLimit
				+ "]" + "Amount" + banktransactions.getAmount();
	}

	public BankAccount(String name, String age, String gender, String bankName, String cardNumber, String creditLimit) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bankName = bankName;
		this.cardNumber = cardNumber;
		this.creditLimit = creditLimit;
	}

	public void setBankTransactions(BankTransactions banktransactions) {
		this.banktransactions = banktransactions;
	}

	public BankTransactions getBankTransactions() {
		return banktransactions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

}
