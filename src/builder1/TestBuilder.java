package builder1;

public class TestBuilder {

	public static void main(String[] args) {
		PizzaBuilder capricciosaBuilder = new CapricciosaBuilder();
		PizzaChef chef = new PizzaChef(capricciosaBuilder);
		
		chef.makePizza();
		
		Pizza pizza = chef.getPizza();
		
		System.out.println("We made: " + pizza);

	}

}
