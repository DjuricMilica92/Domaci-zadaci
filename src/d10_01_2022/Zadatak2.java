package d10_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		SmartAirConditioning one= new SmartAirConditioning();
		
		one.brand="Samsung";
		one.temperature=20;
		one.mode="hladi";
		
		one.stampaj();
		
		SmartAirConditioning two= new SmartAirConditioning();
		
		two.brand="Toshiba";
		two.temperature=27;
		two.mode="greje";
		
		two.stampaj();
	}

}
