package d21_01_2022_Zadatak1;

public class Main {

	public static void main(String[] args) {
	
//		U glavnom programu kreirati jednog magacionera i jednog menadzera, 
//		postaviti sektore u kojima rade i ispisati platu za svakog

		
		Sektor jedan= new Sektor("Pravna sluzba", 150000);
		Sektor dva=new Sektor("IT",80000);
		Sektor tri=new Sektor("Higijena",20000);
		Sektor cetiri = new Sektor("Odrzavanje dvorista", 10000);
		
		Radnik milica= new Menadzer();
		milica.setImeIprezime("Milica Djuric");
		milica.zaposliSe(jedan);
		milica.zaposliSe(dva);
		
		Radnik milan=new Magacioner();
		milan.setImeIprezime("Milan Videnovic");
		milan.zaposliSe(tri);
		milan.zaposliSe(cetiri);
		
		System.out.println(milica.imeIprezime + ", " + milica.plata() );
		System.out.println(milan.imeIprezime + ", " + milan.plata());
		
	}

}
