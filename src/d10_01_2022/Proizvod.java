package d10_01_2022;

//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.


public class Proizvod {

	String productName;
	double productPrice;
	double productWeight;
	
	public void stampaj() {
		System.out.println("{{" + this.productName+ "}}" + "{{"+ this.productPrice + "}}" +
							"{{"+ this.productWeight + "}}");
	}
}
