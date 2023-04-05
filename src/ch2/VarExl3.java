package ch2;

public class VarExl3 {
	public static void main(String[] args) {
		float f = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		System.out.println(f);
		// float은 계산에 취약함

		double d = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1; b //d는 생략가능
		System.out.println(d);
		//  실수형은 double을 기본으로 사용 (8byte)
		
		char ch2 = 'B';
		String str = "Korea";  //문자열
		
		int num = 10;
		double dd = 10.5;
		String s = "eng";
		
		System.out.println(num + (dd + s));
		
		System.out.println("---------------");
		
		double d2 = 10.52456;
		System.out.printf("%.2f\n", d2); // 소수점 둘째자리 까지 출력
		System.out.printf("%.3f\n", d2); // 소수점 셋째자리 까지 출력
		
		
		System.out.println("---------------");
		
		int finger = 10;
		System.out.printf("finger : %d\n" , finger); // \n == %n
		System.out.printf("finger : [%5d]\n" , finger);
		System.out.printf("finger : [%-5d]\n" , finger);
		
	}

}
