package d21_01_2022_Zadatak1;

public class Magacioner extends Radnik {
//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//	 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//	 suma plata svih sektor / broj sektora * 0.5
//	 override uje metodu za platu, tako da se plata racuna po formuli:
//	(prosecna plata za sve sektore u kojima radi) * (broj sektora).
	
	
	public Magacioner() {
		super();
	}
	
	private double prosecnaPlata() {
		double prosecnaPlata=0;
		double suma=0;
		
		for(int i=0; i<nizSektora.size();i++) {
			suma=suma+nizSektora.get(i).plata;
			prosecnaPlata=suma/nizSektora.size()*0.5;
	}
		return prosecnaPlata;
}

	@Override
	public double plata() {
		double plata=this.prosecnaPlata()*nizSektora.size();
	
		return plata;
	}
}
