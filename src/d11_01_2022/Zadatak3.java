package d11_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		
		FacebookPost userOne= new FacebookPost();
		
		userOne.fbAccountOne="Milica Djuric";
		userOne.fbAccountTwo="Milan Videnovic";
		userOne.post="Mozda sam pocela da kapiram OOP.";
		userOne.like=3;
		userOne.share=2;
		
		
		userOne.like();
		userOne.share();
		userOne.print();
		
		
		
		FacebookPost userTwo= new FacebookPost();
		
		userTwo.fbAccountOne="Milan Videnovic";
		userTwo.fbAccountTwo="Milica Djuric";
		userTwo.post="Rekao sam ti da nije tesko.";
		userTwo.like=1;
		userTwo.share=1;
		
		userTwo.dislike();
		userTwo.dislike();
		userTwo.dislike();
		userTwo.print();
		
	}

}
