package observer3;

public class TestObserver3 {

	public static void main(String[] args) {
		CryptoCurrencyPrice cp = new CryptoCurrencyPrice();
		CryptoCurrencyUpdateSMS cSMS = new CryptoCurrencyUpdateSMS();
		
		cp.addListener(cSMS);
		
		cp.setBitcoinPrice(100000);
		cp.setEtherPrice(70000);

	}

}
