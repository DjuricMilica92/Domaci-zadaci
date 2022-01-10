package d10_01_2022;

//Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//atribut za mod (hladi/greje)
//metodu za stampu - stampa u formatu 
//
//
//U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning 
//i za svaki od njih pozvati metodu za stampu

public class SmartAirConditioning {
	
	String brand;
	double temperature;
	String mode;
	
	public void stampaj() {
		System.out.println("Brand: " + this.brand);
		System.out.println("Temperature is: " + this.temperature +"° C");
		System.out.println("mode: " + this.mode);
	}

	
	
}
