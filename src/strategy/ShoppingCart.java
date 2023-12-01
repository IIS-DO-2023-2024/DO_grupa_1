package strategy;

public class ShoppingCart {
	//manager klasa
	
	private DiscountStrategy discountStrategy;
	
	public ShoppingCart(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}
	
	public double calculateTotal(double amount) {
		double discountedAmount = amount - discountStrategy.applyDiscount(amount);
		return discountedAmount;
	}

}
