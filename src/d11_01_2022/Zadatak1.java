package d11_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
			
		Proizvod productOne= new Proizvod();   
		
		productOne.productName="Shower gel";
		productOne.productPrice=100;
		productOne.productWeight=245;
		
		
		productOne.increaseThePrice(10);
	
		productOne.stampaj();
		
		System.out.println("Discount price: "+ productOne.discountPrice(20)+ " rsd.");
		System.out.println("Shipping fee: "+ productOne.shippingFee()+" rsd.");
		System.out.println();
		
		Proizvod productTwo= new Proizvod();
		
		productTwo.productName="Hair shampoo";
		productTwo.productPrice=200;
		productTwo.productWeight=502;
		
		productTwo.increaseThePrice(30);
		
		productTwo.stampaj();
		
		System.out.println("Discount price: "+ productTwo.discountPrice(20)+ " rsd.");
		System.out.println("Shipping fee: "+ productTwo.shippingFee()+" rsd.");
		System.out.println();
	}
	}

