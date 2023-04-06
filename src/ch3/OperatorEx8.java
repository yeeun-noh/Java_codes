package ch3;

public class OperatorEx8 {

	public static void main(String[] args) {
		
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b; // -1454759936
		long c2 = (long)a * b; // 2000000000000
		// c 와 c2는 다른 값이 나옴
		
		System.out.println(c);
		System.out.println(c2);
	}

}
