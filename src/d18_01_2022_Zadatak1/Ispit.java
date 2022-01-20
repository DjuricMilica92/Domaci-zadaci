package d18_01_2022_Zadatak1;

public class Ispit {

//	Napisati klasu Ispit koja ima
//	naziv predmeta
//	ocenu (u rasponu od 5 do 10)
//	Ime i prezime profesora koji predaje predmet
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za sve atribute
//	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//	metodu koja stampa ispit u formatu:
//	(naziv predmeta) - (profesor) - (ocena)

	private String predmet;
	private int ocena;
	private String profesor;

	public Ispit(String predmet, int ocena, String profesor) {
		super();
		this.predmet = predmet;
		this.ocena = ocena;
		this.profesor = profesor;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public boolean polozenIspit() {
		boolean polozen = true;
		if (this.ocena > 5 && this.ocena <= 10) {
			return polozen;
		} else {
			return false;
		}
	}

	public void stampa() {
		System.out.println(this.predmet + " - " + this.profesor + " - " + this.ocena);
	}

}
