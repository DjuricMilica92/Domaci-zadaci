package d17_01_2022_Zadatak1;

public class ZeleniKarton {
//	Zadatak
//	Kreirati klasu ZeleniKarton koja ima:
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
	
	private String student;
	private String brIndex;
	private String nazivPredmeta;
	private int ocena;
	private String profesor;
	
	
	


	public ZeleniKarton() {
	}


	public ZeleniKarton(String student, String brIndex, String nazivPredmeta, int ocena, String profesor) {
		this.student = student;
		this.brIndex = brIndex;
		this.nazivPredmeta = nazivPredmeta;
		this.ocena = ocena;
		this.profesor=profesor;
	}


	public String getStudent() {
		return student;
	}


	public void setStudent(String student) {
		this.student = student;
	}


	public String getBrIndex() {
		return brIndex;
	}


	public void setBrIndex(String brIndex) {
		this.brIndex = brIndex;
	}


	public String getNazivPredmeta() {
		return nazivPredmeta;
	}


	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
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
	
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
	
	public boolean polozenIspit() {
		boolean status=true;
		if(ocena>5 && ocena<=10) {
			return status;
		} else {
			return false;
		}
	}
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
	
	public void stampa () {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.student);
		System.out.println("Profesor: " + this.profesor);
		
		
	}

}
