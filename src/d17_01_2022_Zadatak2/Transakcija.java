package d17_01_2022_Zadatak2;

public class Transakcija {
//	
//	Kreirati klasu Transakcija koja ima:
//		id transakcije
//		racun sa kog se prenose sredstva
//		racun na koji se prenose sredstva
//		gettere i settere
//		konstruktore
//		privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 
//		S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar 
//		koji predstavlja visinu transakcije
//		Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//		metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se 
//		unosi vrednost koja se prebacuje. 
//		Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje 
//		samo (trazena suma).
//		(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//		metodu koja stampa podatke o transakciji u formatu:
//		id transkacije
//		Racun sa: Ime i prezime  -  broj racuna
//		Racun na: Ime i prezime  -  broj racuna
//
//			Naravno u glavnom kreirati objekte i testirati funkcionalnosti 

	
	private int idTransakcije;
	private Racun posiljalac;
	private Racun primalac;
	
	
	public Transakcija(int idTransakcije, Racun posiljalac, Racun primalac) {
		super();
		this.idTransakcije = idTransakcije;
		this.posiljalac = posiljalac;
		this.primalac = primalac;
	}
	public int getIdTransakcije() {
		return idTransakcije;
	}
	public void setIdTransakcije(int idTransakcije) {
		this.idTransakcije = idTransakcije;
	}
	public Racun getPosiljalac() {
		return posiljalac;
	}
	public void setPosiljalac(Racun posiljalac) {
		this.posiljalac = posiljalac;
	}
	public Racun getPrimalac() {
		return primalac;
	}
	public void setPrimalac(Racun primalac) {
		this.primalac = primalac;
	}
	
	
//	privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 
//		S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar 
//		koji predstavlja visinu transakcije
	
	private double provizija (double iznos) {
		double provizija=0;
		if (iznos<4500) {
			provizija=45;
		} else {
			provizija=iznos*0.01;
		}
		return provizija;
	}
	
//	metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se 
//	unosi vrednost koja se prebacuje. 
	
	public void izvrsiTransakciju(double iznos) {
		if(this.getPosiljalac().getStanjeNaRacunu()>iznos+this.provizija(iznos)) {
			 this.getPosiljalac().promenaStanja(-(iznos+this.provizija(iznos))) ;
			 this.getPrimalac().promenaStanja(iznos);
		}
	}
	
//	metodu koja stampa podatke o transakciji u formatu:
////		id transkacije
////		Racun sa: Ime i prezime  -  broj racuna
////		Racun na: Ime i prezime  -  broj racuna
	
	public void stampaj() {
		System.out.println("ID transakcije: " + this.idTransakcije );
		this.posiljalac.stampa();
		this.primalac.stampa();
		
	}
}
