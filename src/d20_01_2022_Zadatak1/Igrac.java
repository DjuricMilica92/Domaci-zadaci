package d20_01_2022_Zadatak1;

public class Igrac extends Osoba {

//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

	private int brojIgraca;
	private String pozicija;
	private boolean daLiJeKapiten;

	public Igrac() {
		super();
	}

	public Igrac(String imeIprezime, String jmbg, int godinaRodjenja, int brojIgraca, String pozicija,
			boolean daLiJeKapiten) {
		super(imeIprezime, jmbg, godinaRodjenja);
		this.brojIgraca = brojIgraca;
		this.pozicija = pozicija;
		this.daLiJeKapiten = daLiJeKapiten;
	}

	public int getBrojIgraca() {
		return brojIgraca;
	}

	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isDaLiJeKapiten() {
		return daLiJeKapiten;
	}

	public void setDaLiJeKapiten(boolean daLiJeKapiten) {
		this.daLiJeKapiten = daLiJeKapiten;
	}

	@Override
	public void stampa() {
		System.out.println("Ime i prezime: " + this.imeIprezime + ", JMBG: " + this.jmbg + ", Godina rodjenja: "
				+ this.godinaRodjenja);
		System.out.println("Broj igraca: " + this.brojIgraca + ", Pozicija: " + this.pozicija);
		if (this.daLiJeKapiten == true) {
			System.out.println("Igrac je kapiten.");
		} else {
			System.out.println("Igrac nije kapiten.");
		}
		System.out.println("--------------------------------------------------");
	}

}
