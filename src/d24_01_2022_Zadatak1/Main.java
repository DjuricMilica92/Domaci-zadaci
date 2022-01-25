package d24_01_2022_Zadatak1;

public class Main {

	public static void main(String[] args) {

		Korpa korpa = new Korpa();
		SuperKartica sk = new SuperKartica("2365-9568-852", "Milica Djuric", 20);

		Ambalaza a1 = new Tetrapak("963-125-658", "Nectar jabuka", 220, 250, true, 80);
		Ambalaza a2 = new Tetrapak("654-951-357", "Moja kravica Mleko", 500, 550, false, 90);
		Ambalaza a3 = new StaklenaAmbalaza("854-129-743", "Niksicko", 500, 600, true, 80, 10);
		Ambalaza a4 = new StaklenaAmbalaza("694-235-221", "Vranac", 800, 900, false, 500, 10);

		sk.stampaKartice();
		System.out.println();

		korpa.dodajAmbalazu(a1);
		korpa.dodajAmbalazu(a2);
		korpa.dodajAmbalazu(a3);
		korpa.dodajAmbalazu(a4);
		korpa.izbaciAmbalazu("963-125-658");

		korpa.stampaj();

		System.out.println("Ukupna vrednost korpe je " + korpa.cenaKorpe(sk) + " rsd.");

	}

}
