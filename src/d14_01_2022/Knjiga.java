package d14_01_2022;

public class Knjiga {

//	Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
	
	 private String isbn;
	 private String naslovKnjige;
	 private int godinaIzdanja;
	 private Autor autor;
	 
	 
	 public Knjiga() {//default
	 }
	 
	 public Knjiga (String isbn, String naslovKnjige, int godinaIzdanja, Autor autor) {
		 this.isbn=isbn;
		 this.naslovKnjige=naslovKnjige;
		 this.godinaIzdanja=godinaIzdanja;
		 this.autor=autor;
		 
	 }
	 
	 public void setISBN(String isbn) {
		 this.isbn=isbn;
	 }

	 public String getISBN() {
		 return this.isbn;
	 }
	 
	 public void setNaslov (String naslovKnjige) {
		 this.naslovKnjige=naslovKnjige;
	 }
	 
	 public String getNaslov () {
		 return this.naslovKnjige;
	 }
	
	 public void setIzdanje (int godinaIzdanja) {
		 this.godinaIzdanja=godinaIzdanja;
	 }
	 
	 public int getIzdanje () {
		 return this.godinaIzdanja;
	 }
	 
	 public Autor setImeAutora (Autor autor) {
		 return this.autor=autor;
	 }
	 public Autor getImeAutora() {
		 return this.autor;
	 }
	 
	 public void print () {
		 System.out.println(this.isbn);
		 System.out.println(this.naslovKnjige + " - " + this.godinaIzdanja);
		 System.out.println(this.autor.getIme() +" " + this.autor.getPrezime());
		 System.out.println ();
	 }
	 
	 
}
