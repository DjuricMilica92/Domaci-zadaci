package d21_01_2022_Zadatak1;

import java.util.ArrayList;

public abstract class Radnik {

//	Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

	protected String imeIprezime;
	protected ArrayList<Sektor> nizSektora = new ArrayList<Sektor>();

	public Radnik() {
		super();
	}

	public String getImeIprezime() {
		return imeIprezime;
	}

	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}

	public ArrayList<Sektor> getNizSektora() {
		return nizSektora;
	}

	public void setNizSektora(ArrayList<Sektor> nizSektora) {
		this.nizSektora = nizSektora;
	}

	public abstract double plata();

	public void zaposliSe(Sektor sektor) {
		nizSektora.add(sektor);
	}

}
