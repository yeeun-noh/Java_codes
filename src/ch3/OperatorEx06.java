package ch3;

public class OperatorEx06 {

	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
	//	byte c = a + b;  => 에러; 형전환 필요, (a+b)의 값이 int형이기 때문
		byte c = (byte)(a + b);
		System.out.println(c);
	}

}
