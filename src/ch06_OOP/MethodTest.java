package ch06_OOP;

class MyMath{
	long add(long a, long b) {
		long result = a+b;
		return result;
		// return a+b; //���� �� ���� �̿� ���� �� �ٷ� ��밡��
	}
	
	long sub(long a, long b) {return a-b;}
	long mul(long a, long b) {return a*b;}
	double divi(double a, double b) {return a/b;}
}

public class MethodTest {
	public static void main(String[] args) {

		MyMath mm = new MyMath();
		long val = mm.add(2L, 3L); //ȣ���� �ڸ��� return���� ����ϰ� ���Կ����ڿ� ���� ���� val�� ����
		
		System.out.println(val); // 5 ���
		
	}
}
