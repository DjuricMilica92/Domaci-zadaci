package d24_01_2022_Zadatak1;

public abstract class Ambalaza {
//	Kreirati abstraktnu klasu Ambalaza koja ima:
//		barkod (primer: 328232-2823)
//		naziv artikla
//		neto tezinu
//		bruto tezinu
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere
//		metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//		abstraktnu metodu koja vraca cenu artikla
//		abstraktnu metodu stampaj

	protected String barkod;
	protected String naziv;
	protected double netoTezina;
	protected double brutoTezina;

	public Ambalaza(String barkod, String naziv, double netoTezina, double brutoTezina) {
		super();
		this.barkod = barkod;
		this.naziv = naziv;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getNetoTezina() {
		return netoTezina;
	}

	public void setNetoTezina(double netoTezina) {
		this.netoTezina = netoTezina;
	}

	public double getBrutoTezina() {
		return brutoTezina;
	}

	public void setBrutoTezina(double brutoTezina) {
		this.brutoTezina = brutoTezina;
	}
	
	public double tezinaPakovanja() {
		return brutoTezina-netoTezina;
	}
	
	public abstract double cenaArtikla();
	public abstract void stampa();
}
