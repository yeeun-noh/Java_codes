package ch2;

public class PrintfEx2 {

	public static void main(String[] args) {
		String url = "www.google.com";
		
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d = %f%n", d); // 마지막 자리 반올림됨
		System.out.printf("d = %14.10f%n", d); // 전체 14자리 중 소수점 10자리 (%전체자리.소수점아래자리f)
		
		System.out.printf("[12345678901234567890]%n", d);
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url); // 오른쪽 정렬
		System.out.printf("[%-20s]%n", url); // 왼쪽 정렬
		System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만	
	}

}
