package d17_01_2022_Zadatak2;

public class Main {

	public static void main(String[] args) {
		
		Racun posiljalac = new Racun("840-17345289", "Milica Djuric", 35000);
		Racun primalac = new Racun("365-2456987", "Milan Videnovic", 40000);
		
		Transakcija transakcija= new Transakcija(175,posiljalac, primalac);
		
		posiljalac.stampa();
		
		primalac.stampa();
		
		transakcija.izvrsiTransakciju(5000);
		transakcija.stampaj();
	}

}
