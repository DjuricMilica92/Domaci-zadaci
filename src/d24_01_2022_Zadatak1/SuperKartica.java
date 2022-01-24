package d24_01_2022_Zadatak1;

public class SuperKartica {

//	Kreirati klasu SuperKartica koja ima:
//		broj kartice
//		ime i prezime vlasnika
//		popust (200, 500, … )
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere 
//		metodu stampaj koja stampa karticu u formatu:
//		(broj kartice), (ime i prezime)

	private int brKartice;
	private String vlasnik;
	private int popust;
	
	public SuperKartica(int brKartice, String vlasnik, int popust) {
		super();
		this.brKartice = brKartice;
		this.vlasnik = vlasnik;
		this.popust = popust;
	}

	public int getBrKartice() {
		return brKartice;
	}

	public void setBrKartice(int brKartice) {
		this.brKartice = brKartice;
	}

	public String getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}
	

	public void stampaKartice() {
		System.out.println("Broj kartice: " + this.brKartice +", "+ this.vlasnik);
	}
}
