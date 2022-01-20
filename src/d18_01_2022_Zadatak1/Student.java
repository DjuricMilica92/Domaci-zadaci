package d18_01_2022_Zadatak1;

import java.util.ArrayList;

public class Student {

//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)

	private String brIndexa;
	private String student;
	private String stepenStudija;
	private ArrayList<Ispit> nizIspita = new ArrayList<Ispit>();

	public Student(String brIndexa, String student, String stepenStudija) {
		this.brIndexa = brIndexa;
		this.student = student;
		this.stepenStudija = stepenStudija;
	}

	public String getBrIndexa() {
		return brIndexa;
	}

	public void setBrIndexa(String brIndexa) {
		this.brIndexa = brIndexa;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getStepenStudija() {
		return stepenStudija;
	}

	public void setStepenStudija(String stepenStudija) {
		this.stepenStudija = stepenStudija;
	}

	public ArrayList<Ispit> getNizIspita() {
		return nizIspita;
	}

	public void dodajIspit(String predmet, int ocena, String profesor) {
		this.nizIspita.add(new Ispit(predmet, ocena, profesor));
	}

	public int prosekPolozenih() {
		int zbir = 0;
		for (int i = 0; i < nizIspita.size(); i++) {
			if (nizIspita.get(i).polozenIspit() == true) {
				zbir = zbir + nizIspita.get(i).getOcena();
			}
		}
		return zbir / nizIspita.size();
	}

	public void stampaj() {
		System.out.println(this.brIndexa + " - " + this.student + " - " + this.stepenStudija);
		System.out.println("Predmet:");
		for (int i = 0; i < nizIspita.size(); i++) {
			nizIspita.get(i).stampa();
		}
		System.out.println("Prosecna ocena je " + this.prosekPolozenih());
	}

}
