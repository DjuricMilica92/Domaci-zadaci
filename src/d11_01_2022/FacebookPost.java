package d11_01_2022;

public class FacebookPost {

	String fbAccountOne;
	String fbAccountTwo;
	String post;
	int like;
	int share;

	public void print() {
		System.out.println(this.fbAccountOne + " >>>>> " + this.fbAccountTwo);
		System.out.println(this.post);
		System.out.println("Likes " + this.like + " |  Shares " + this.share);
	}

	public void like() {
		this.like = this.like + 1;
	}

	public void dislike() {
		this.like = this.like - 1;
		if (this.like <= 0) {
			this.like = 0;
		}
	}

	public void share() {
		this.share = this.share + 1;
	}

}
