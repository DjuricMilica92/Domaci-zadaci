package d20_01_2022_Zadatak1;

public class Main {

	public static void main(String[] args) {
//		U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

		Igrac jedan = new Igrac("Milos Teodosic", "1903987730012", 1987, 6, "Playmaker", true);
		Igrac dva = new Igrac("Bogdan Bogdanovic", "1808992730026", 1992, 13, "Shooting guard", false);

		jedan.stampa();
		dva.stampa();

		Trener prvi = new Trener("Aleksandar Djordjevic", "2608967730054", 1967, 15, "za igru");
		Trener drugi = new Trener("Dejan Milojevic", "1504977730259", 1977, 10, "pomocni");

		prvi.stampa();
		drugi.stampa();

	}
}
