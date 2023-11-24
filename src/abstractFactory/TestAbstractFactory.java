package abstractFactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		WorkBillFactory workBillFactory = new WorkBillFactory();
		BillManager billManager = new BillManager(workBillFactory);
		
		billManager.processBill("vat");

	}

}
