package ch06_OOP;

class TvTest {

	// �������(�Ӽ�) ����
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
		
		t2 = t1; //t1�� �����ϰ� �ִ� ��(�ּ�)�� t2�� ����
		t1.channel = 7;
		System.out.println("t1 : " + t1.channel);
		System.out.println("t2 : " + t2.channel);
		
		
		
	}
}
