package d24_01_2022_Zadatak1;

public class StaklenaAmbalaza extends Ambalaza{
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//		kaucija za flasu
//		atribut koji kaze da li se za flasu placa kaucija
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu
//		ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//		ako se ne placa, (osnovna cena) * 1.2
//		metoda stampaj stampa sve podatke iz klase staklena flasa.

	private int kaucija;
	private boolean placanjeKaucije;
	private double osnovnaCena;
	
	
	
	public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina, int kaucija,
			boolean placanjeKaucije, double osnovnaCena) {
		super(barkod, naziv, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.placanjeKaucije = placanjeKaucije;
		this.osnovnaCena = osnovnaCena;
	}
	
	public int getKaucija() {
		return kaucija;
	}
	public void setKaucija(int kaucija) {
		this.kaucija = kaucija;
	}
	public boolean isPlacanjeKaucije() {
		return placanjeKaucije;
	}
	public void setPlacanjeKaucije(boolean placanjeKaucije) {
		this.placanjeKaucije = placanjeKaucije;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	

//	metoda stampaj stampa sve podatke iz klase staklena flasa.
	
	@Override
	public double cenaArtikla() {
		if(placanjeKaucije) {
			return this.getOsnovnaCena()*1.2 + this.getKaucija();
		} else {
			return this.getOsnovnaCena()*1.2;
		}
	}
	@Override
	public void stampa () {
		System.out.println("***Staklena ambalaza***");
		System.out.println("Bar kod: " + this.getBarkod());
		System.out.println("Naziv: " + this.getNaziv());
		System.out.println("Osnovna cena: " + this.getOsnovnaCena()+ " din.");
		System.out.println("Cena artikla: " + cenaArtikla()+ " din.");
		System.out.println();
}
}
