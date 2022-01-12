package d11_01_2022;

public class SmartAirConditioning {
	
	String brand;
	double temperature;
	String mode;
	int consumptionCooling;
	int consumptionHeating;
	
	
	public void stampaj() {
		System.out.println("Brand: " + this.brand);
		System.out.println("Temperature is: " + this.temperature +"° C");
		System.out.println("mode: " + this.mode);
	}
	
	public int monthlyConsumption() {
		int monthly=0;
		if(this.mode.equals("hladi")) {
			monthly=30*15*this.consumptionCooling;
		} else if(this.mode.equals("greje")) {
			monthly=30*15*this.consumptionHeating;
		}
		return monthly;
	
	}		
	
	public int monthlyPrice() {
		int price=0;
		int greenZone=350;
		
			price=((this.monthlyConsumption() - greenZone) *9) + 350*6;
			
			return price;
	}
}
