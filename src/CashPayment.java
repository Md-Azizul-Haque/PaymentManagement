public class CashPayment implements Payment {
	
	private int amount;
	
	public CashPayment(int amount) {
		this.amount = amount;
	}
	
	@Override
	public int getAmount() {
		return amount;
	}
}
