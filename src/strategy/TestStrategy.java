package strategy;

public class TestStrategy {

	public static void main(String[] args) {
		ShoppingCart studentShoppingCart = new ShoppingCart(new StudentDiscount());
		ShoppingCart pensionersShoppingCart = new ShoppingCart(new PensionersDiscount());
		
		double amount = 100;
		System.out.println("Regularna cena: " + amount + " RSD");
		
		double studentPrice = studentShoppingCart.calculateTotal(amount);
		System.out.println("Cena za studente je: " + studentPrice + " RSD");
		
		double pensionersPrice = pensionersShoppingCart.calculateTotal(amount);
		System.out.println("Cena za penzionere je: " + pensionersPrice + " RSD");

		// BuffredWriter -> klasa u Javi koja omogućava pisanje PODATAKA u tok podataka (stream); upis u tekstualnu detoteku (.txt)
		// ObjectOutputStrem -> klasa u Javi koja omogućava pisanje OBJEKATA u tok podataka (stream); kreiranje crteža (.bin)
	}

}
