package d17_01_2022_Zadatak2;

public class Racun {
//	Kreirati klasu Racun koja ima:
//		broj racuna (npr: 170-289328923-23)
//		ime i prezime osobe
//		trenutno stanje na racunu (npr: 100, 1220)
//		gettere i setter za sve atribute, sem settera za stanje na racunu
//		metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//		metodu koja stampa podatke o racunu u formatu:
//		Ime i prezime  -  broj racuna
//		stanje na racunu je (trenutno stanje) rsd.

	private String brRacuna;
	private String vlasnikRacuna;
	private double stanjeNaRacunu;
	
	
	public Racun(String brRacuna, String vlasnikRacuna, double stanjeNaRacunu) {
		this.brRacuna = brRacuna;
		this.vlasnikRacuna = vlasnikRacuna;
		this.stanjeNaRacunu = stanjeNaRacunu;
	}
	
	
	public String getBrRacuna() {
		return brRacuna;
	}
	public void setBrRacuna(String brRacuna) {
		this.brRacuna = brRacuna;
	}
	public String getVlasnikRacuna() {
		return vlasnikRacuna;
	}
	public void setVlasnikRacuna(String vlasnikRacuna) {
		this.vlasnikRacuna = vlasnikRacuna;
	}
	public double getStanjeNaRacunu() {
		return stanjeNaRacunu;
	}
	
	public void promenaStanja (double iznos) {
		if (this.stanjeNaRacunu> iznos) {
			this.stanjeNaRacunu=this.stanjeNaRacunu+iznos;
		}
	}
	
	public void stampa() {
		System.out.println(this.vlasnikRacuna + " - " + this.brRacuna);
		System.out.println("Vase stanje na racunu je: " + this.stanjeNaRacunu + "RSD.");
		System.out.println();
	}
}
