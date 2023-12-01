package builder2;

public class TestBuilder2 {

	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder("integralna");
		
		builder.meat("Šunka").meat("Čajna").spread("Urnebes").salad("Zelena").spread("Pavlaka");
		
		Sandwich sandwich = builder.build();
		System.out.println(sandwich);
		
		//kraći zapis
		Sandwich.Builder builder2 = new Sandwich.Builder("Bela kifla");
		
		Sandwich sandwich2 = builder2.meat("šunka").salad("paradajz").spread("majonez").spread("urnebes").build();
		System.out.println(sandwich2);
	}

}
