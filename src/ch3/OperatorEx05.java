package ch3;

public class OperatorEx05 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a+b);
		System.out.printf("%d - %d = %d%n", a, b, a-b);
		System.out.printf("%d * %d = %d%n", a, b, a*b);
		System.out.printf("%d / %d = %d%n", a, b, a/b); // 정수 + 정수 이므로 2.5중 2만 출력 
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); // 정수 + 실수 이므로 2.500000 다 출력
	}

}
