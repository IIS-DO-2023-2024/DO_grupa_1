package adapter;

public class BoatAdapter2 extends Boat implements Vehicle{
	
	// ne preporucuju se ovaj nacin realizacije, nego BoatAdapter.java
	@Override
	public void goFaster() {
		rowFaster();
		
	}

}
