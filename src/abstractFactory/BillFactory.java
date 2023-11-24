package abstractFactory;

import simpleFactory.Bill;

public abstract class BillFactory {
	
	//ova mora da ima svaka abstract factory
	public abstract Bill createBill(String type);
}
