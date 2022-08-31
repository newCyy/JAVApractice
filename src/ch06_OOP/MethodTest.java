package ch06_OOP;

class MyMath{
	long add(long a, long b) {
		long result = a+b;
		return result;
		// return a+b; //위의 두 줄을 이와 같이 한 줄로 사용가능
	}
	
	long sub(long a, long b) {return a-b;}
	long mul(long a, long b) {return a*b;}
	double divi(double a, double b) {return a/b;}
}

public class MethodTest {
	public static void main(String[] args) {

		MyMath mm = new MyMath();
		long val = mm.add(2L, 3L); //호출한 자리를 return값이 대신하고 대입연산자에 의해 변수 val에 저장
		
		System.out.println(val); // 5 출력
		
	}
}
