package d24_01_2022_Zadatak1;

public class Tetrapak extends Ambalaza {

//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
//		metoda stampaj stampa sve podatke iz klase tetrapak.

	private boolean reciklaza;
	private double osnovnaCena;

	public Tetrapak(String barkod, String naziv, double netoTezina, double brutoTezina, boolean reciklaza,
			double osnovnaCena) {
		super(barkod, naziv, netoTezina, brutoTezina);
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isReciklaza() {
		return reciklaza;
	}

	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
//		metoda stampaj stampa sve podatke iz klase tetrapak.

	@Override
	public double cenaArtikla() {
		if (reciklaza) {
			return tezinaPakovanja() * 1.5 + this.getOsnovnaCena();
		} else {
			return this.getOsnovnaCena();
		}
	}

	@Override
	public void stampa() {
		System.out.println("***Tetrapak***");
		System.out.println("Bar kod: " + this.getBarkod());
		System.out.println("Bruto: " + this.getBrutoTezina() + " gr.");
		System.out.println("Neto: " + this.getNetoTezina() + " gr.");
		System.out.println("Naziv: " + this.getNaziv());
		System.out.println("Osnovna cena: " + this.osnovnaCena + " din.");
		System.out.println("Cena artikla: " + cenaArtikla() + " din.");
		System.out.println();
	}
}
