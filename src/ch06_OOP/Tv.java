package ch06_OOP;

class TvTest {

	// 멤버변수(속성) 설정
	String color;
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

}

public class Tv {
	public static void main(String[] args) {
		TvTest t1 = new TvTest();
		TvTest t2 = new TvTest();
		
		System.out.println("t1 : " + t1.channel);
		System.out.println("t2 : " + t2.channel);
		
		t2 = t1; //t1이 저장하고 있는 값(주소)을 t2에 저장
		t1.channel = 7;
		System.out.println("t1 : " + t1.channel);
		System.out.println("t2 : " + t2.channel);
		
		
		
	}
}
