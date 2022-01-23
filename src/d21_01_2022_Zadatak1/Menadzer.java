package d21_01_2022_Zadatak1;

public class Menadzer extends Radnik {

//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

	public Menadzer() {
		super();

	}

	@Override
	public double plata() {
		double suma = 0;
		for (int i = 0; i < nizSektora.size(); i++) {
			suma = suma + nizSektora.get(i).plata;
		}
		return suma;
	}
}
