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

	private String brKartice;
	private String vlasnik;
	private double popust;

	public SuperKartica(String brKartice, String vlasnik, double popust) {
		this.brKartice = brKartice;
		this.vlasnik = vlasnik;
		this.popust = popust;
	}

	public String getBrKartice() {
		return brKartice;
	}

	public void setBrKartice(String brKartice) {
		this.brKartice = brKartice;
	}

	public String getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}

	public double getPopust() {
		return popust;
	}

	public void setPopust(double popust) {
		this.popust = popust;
	}

	public void stampaKartice() {
		System.out.println("***Super Kartica***");
		System.out.println("Broj kartice: " + this.brKartice + ", " + this.vlasnik);
	}
}
