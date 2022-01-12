package d10_01_2022;

public class Proizvod {

	public String productName;
	public double productPrice;
	public double productWeight;
	
	public void stampaj() {
		System.out.println("{{" + this.productName+ "}} " + "{{"+ this.productPrice + " rsd"+"}} " +
							"{{"+ this.productWeight + " gr"+"}}");
	}
}
