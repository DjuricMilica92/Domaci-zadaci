package d20_01_2022_Zadatak1;

public class Trener extends Osoba {
	
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

	private int godineIskustva;
	private String tipTrenera;
	
	
	
	public Trener() {
		super();
	}

	public Trener(String imeIprezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
		super(imeIprezime, jmbg, godinaRodjenja);
		this.godineIskustva=godineIskustva;
		this.tipTrenera=tipTrenera;
		}


	@Override
	public void stampa() {
		System.out.println("Ime i prezime: " + this.imeIprezime +", JMBG: " + this.jmbg + ", Godina rodjenja: " + this.godinaRodjenja);
		System.out.println("Godine iskustva: " + this.godineIskustva);
		System.out.println("Tip trenera: " + this.tipTrenera);
		System.out.println("------------------------------------------------");
	}
}
