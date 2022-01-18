package d17_01_2022_Zadatak1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
//		U glavnoj klasi:
//			kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

		
		
		ArrayList<ZeleniKarton> pravniFakultet = new ArrayList<ZeleniKarton>();
		
		ZeleniKarton karton1 = new ZeleniKarton("Milica Djuric", "127/11", "Pravo intelektualne svojine", 6, "Vidoje Spasic");
		ZeleniKarton karton2 = new ZeleniKarton("Pavle Pavlovic", "521/11", "Gradjansko procesno pravo", 8, "Nevena Petrusic");
		ZeleniKarton karton3 = new ZeleniKarton("Milan Milanovic", "421/11", "Ustavno pravo", 10, "Dragan Stojanovic");
		ZeleniKarton karton4 = new ZeleniKarton("Dusan Dusanic", "007/07", "Krivicno pravo", 5, "Sasa Knezevic");
		ZeleniKarton karton5 = new ZeleniKarton("Petar Petrovic", "229/12", "Radno pravo", 10, "Goran Obradovic");
		ZeleniKarton karton6 = new ZeleniKarton("Milica Djuric", "127/11", "Medjunarodno trgovinsko pravo", 9, "Predrag Cvetkovic");
		ZeleniKarton karton7 = new ZeleniKarton("Pavle Pavlovic", "521/11", "Trgovinsko pravo", 5, "Milena Zattila");
		ZeleniKarton karton8 = new ZeleniKarton("Marko Markovic", "245/10", "Upravno pravo", 7, "Predrag Dimitrijevic");
		ZeleniKarton karton9 = new ZeleniKarton("Jovan Jovanovic", "069/13", "Uvod u gradjansko i stvarno pravo", 7, "Radmila Kustrimovic");
		ZeleniKarton karton10 = new ZeleniKarton("Pavle Pavlovic", "521/11", "Medjunarodno javno pravo", 8, "Zoran Radivojevic");
		
	
		pravniFakultet.add(karton1);
		pravniFakultet.add(karton2);
		pravniFakultet.add(karton3);
		pravniFakultet.add(karton4);
		pravniFakultet.add(karton5);
		pravniFakultet.add(karton6);
		pravniFakultet.add(karton7);
		pravniFakultet.add(karton8);
		pravniFakultet.add(karton9);
		pravniFakultet.add(karton10);
		
		for(int i=0; i<pravniFakultet.size(); i++) {
			pravniFakultet.get(i).stampa();
			System.out.println("--------------------------------------------");
		}
		
		double zbirOcena=0;
		for(int i=0; i<pravniFakultet.size(); i++)	{
			zbirOcena=zbirOcena + pravniFakultet.get(i).getOcena();
		}
		
		double prosek=zbirOcena/pravniFakultet.size();
		
		System.out.println("Prosek ocena je " + prosek);
		System.out.println("--------------------------------------------");
		
		
		double zbirPolozenih=0;
		int brojPolozenih=0;
		for(int i=0; i<pravniFakultet.size(); i++) {
			if(pravniFakultet.get(i).polozenIspit()==true) {
				zbirPolozenih=zbirPolozenih + pravniFakultet.get(i).getOcena();
				brojPolozenih++;
			}
		}
		
		double prosekPolozenih=zbirPolozenih/brojPolozenih;
		
		System.out.println("Prosek ocena polozenih ispita je " + prosekPolozenih);
		System.out.println("--------------------------------------------");
		
		
		
	}

}
