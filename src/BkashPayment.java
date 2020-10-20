public class BkashPayment implements Payment {
	
	private int amount;
	
	public BkashPayment(int amount) {
		this.amount = amount;
	}
	
	@Override
	public int getAmount() {
		return amount;
	}
}