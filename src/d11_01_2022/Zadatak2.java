package d11_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
SmartAirConditioning one= new SmartAirConditioning();
		
		one.brand="Samsung";
		one.temperature=20;
		one.mode="hladi";
		one.consumptionCooling=1;
		one.consumptionHeating=2;
		
		one.stampaj();
		
		System.out.println("Mesecna potrosnja je: " + one.monthlyConsumption());
		System.out.println("Racun: " + one.monthlyPrice());
		
		SmartAirConditioning two= new SmartAirConditioning();
		
		two.brand="Toshiba";
		two.temperature=27;
		two.mode="greje";
		two.consumptionCooling=1;
		two.consumptionHeating=2;
		
		two.stampaj();
		System.out.println("Mesecna potrosnja je: " + two.monthlyConsumption());
		System.out.println("Racun: " + two.monthlyPrice());
	}

}
