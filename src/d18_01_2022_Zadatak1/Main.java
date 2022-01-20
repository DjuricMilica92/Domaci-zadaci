package d18_01_2022_Zadatak1;

public class Main {

	public static void main(String[] args) {
		Student milica = new Student("127/11", "Milica Djuric", "Osnovne studije");

		milica.dodajIspit("Medjunarodno privatno pravo", 9, "Mirko Zivkovic");
		milica.dodajIspit("Gradjansko procesno pravo", 8, "Nevena Petrusic");
		milica.dodajIspit("Krivicno pravo", 6, "Dragan Jovasevic");

		milica.stampaj();

	}
}
