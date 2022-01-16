package d14_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		
		Autor autorJedan=new Autor ("Markus" , "Zusak");
		
		Knjiga knjigaJedan = new Knjiga("978-3-16-148410-0", "The Book Thief", 2009, autorJedan);
		Knjiga knjigaDva = new Knjiga("878-4-16-56342-3", "The Messenger", 2002, autorJedan);
		
		
		knjigaJedan.print();	
		knjigaDva.print();
	
		Autor autorDva=new Autor ("Guillaume" , "Musso");
		
		Knjiga prvaKnjiga = new Knjiga("978-1908313058", "The Girl on Paper", 2010, autorDva);
		Knjiga drugaKnjiga = new Knjiga("978-0316590969", "Central Park", 2014, autorDva);
		
		prvaKnjiga.print();
		drugaKnjiga.print();
		
	}

}
