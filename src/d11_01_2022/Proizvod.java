package d11_01_2022;

public class Proizvod {
	
	String productName;
	double productPrice;
	double productWeight;
	double discount;
	
	public void stampaj() {
		System.out.println("{{" + this.productName+ "}} " + "{{"+ this.productPrice + " rsd"+"}} " +
							"{{"+ this.productWeight + " gr"+"}}");
	}	
	
	public void increaseThePrice (int increase) {
		this.productPrice= this.productPrice + increase;
	}
	
	public double discountPrice(double discount) {
		double discountPrice=0;
		return discountPrice=this.productPrice-this.productPrice*discount/100;
	}
	
	public double shippingFee() {
		double fee;
		if(this.productWeight<=100) {
			fee=200;
		} else if(this.productWeight<=500) {
			fee=500;
		} else {
			fee=1000;
		}
		return fee;
}
}
