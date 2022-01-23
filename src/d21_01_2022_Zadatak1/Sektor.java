package d21_01_2022_Zadatak1;

public class Sektor {

//	Kreirati klasu Sektor koja ima:
//	 naziv sektora
//	 platu koja je za taj sektor

	protected String nazivSektora;
	protected double plata;

	public Sektor(String nazivSektora, double plata) {
		super();
		this.nazivSektora = nazivSektora;
		this.plata = plata;
	}

	public String getNazivSektora() {
		return nazivSektora;
	}

	public void setNazivSektora(String nazivSektora) {
		this.nazivSektora = nazivSektora;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

}
