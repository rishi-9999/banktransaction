package assignment;

public class BankTransactions {
	private String cardNumber;
	private String tDate;
	private String amount;

	@Override
	public String toString() {
		return "BankTransactions [cardNumber=" + cardNumber + ", tDate=" + tDate + ", amount=" + amount + "]";
	}

	public BankTransactions(String cardNumber, String tDate, String amount) {
		super();
		this.cardNumber = cardNumber;
		this.tDate = tDate;
		this.amount = amount;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String gettDate() {
		return tDate;
	}

	public void settDate(String tDate) {
		this.tDate = tDate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
