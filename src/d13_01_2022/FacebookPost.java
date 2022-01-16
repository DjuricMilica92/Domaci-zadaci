package d13_01_2022;

public class FacebookPost {
//	1.Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post 
//		(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
	
//		 *** Od gettera i settera:
//		korisnik moze da procita bilo koji atribut 
//		ali ne moze da menja broj lajkova i broj deljenja (nemamo settere za ove atribute)
//		*** Konstruktore:
//			konstruktori koji su potrebni i logicni
//		  Od metoda:
//		like(), koja povecava broj lajkova za 1.
//		dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//		share(), koja povecava broj deljenja za 1
//		print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)
//
//		U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
	
	
	private String fbAccountOne;
	private String fbAccountTwo;
	private String post;
	private int like;
	private int share;

	
	public FacebookPost() { // default
	}
	
	public FacebookPost(String accountOne, String accountTwo, String post, int like, int share) {
			this.fbAccountOne=accountOne;
			this.fbAccountTwo=accountTwo;
			this.post=post;
			this.like=like;
			this.share=share;
	}
	
	
	public void setAccountOne(String fbAccountOne) {
		this.fbAccountOne=fbAccountOne;
	}
	
	public String getAccountOne() {
		return this.fbAccountOne;
	}
	
	public void setAccountTwo(String fbAccountTwo) {
		this.fbAccountTwo=fbAccountTwo;
	}
	
	public String getAccountTwo() {
		return this.fbAccountTwo;
	}
	
	public void setPost(String post) {
		this.post=post;
	}
	
	public String getPost() {
		return this.post;
	}
	
	public int getLike() {
		return this.like;
	}
	
	public int getShare() {
		return this.share;
	}
	
	
	public void print() {
		System.out.println(this.fbAccountOne + " >>>>> " + this.fbAccountTwo);
		System.out.println(this.post);
		System.out.println("Likes " + this.like + " |  Shares " + this.share);
	}

	public void addLike() {
		this.like = this.like + 1;
	}

	public void addDislike() {
		this.like = this.like - 1;
		if (this.like <= 0) {
			this.like = 0;
		}
	}

	public void addShare() {
		this.share = this.share + 1;
	}

}

