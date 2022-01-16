package d13_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {


		FacebookPost userOne = new FacebookPost("Milica Djuric" , "Milan Videnovic","Zdravo. Kako si?", 6, 2);
		
		userOne.addLike();
		userOne.addLike();
		userOne.addDislike();
		userOne.addShare();
		userOne.print();
		
		FacebookPost userTwo = new FacebookPost ( "Milan Videnovic", "Milica Djuric" ,"Danas odlicno. Kako si ti?", 4, 1);
		
		
		userTwo.addDislike();
		userTwo.addDislike();
		userTwo.addLike();
		userTwo.addShare();
		userTwo.print();

	}

}
