package ch06_OOP;

class Card {
	String kind; // ¹«´Ì
	int number; // ¼ıÀÚ

	static int width = 100; // Æø
	static int height = 250; // ³ôÀÌ
}

public class StaticValTest {
	public static void main(String[] args) {

		System.out.println("w : " + Card.width);
		System.out.println("w : " + Card.height);

		Card c1 = new Card();
		Card c2 = new Card();

		c1.kind = "Heart";
		c2.kind = "Spade";

		c1.width = 200;
		c1.height = 300;

		System.out.println("c1.kind : " + c1.kind + ", c2.kind : " + c2.kind);
		System.out.println("c1.width : " + c1.width + ", c1.height : " + c1.height);
		System.out.println("c2.width : " + c2.width + ", c2.height : " + c2.height);

	}
}
