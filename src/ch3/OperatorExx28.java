package ch3;

public class OperatorExx28 {

	public static void main(String[] args) {

		int x = 0xAB, y = 0xF;
		
		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y)); // OR연산자(|)
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y)); // AND연산자(&)
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x ^ y, toBinaryString(x ^ y)); // XOR연산자(^)
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));
		
	} // main의 끝
	
	static String toBinaryString(int x) { // 10진정수를 2진수로 변환하는 메서드
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x); // Integer.toBinaryString(int i): 정수(10진수)를 2진 문자열로 변환
		return tmp.substring(tmp.length()-32); // substring(int x, int y) : 문자열을 잘라낼때 사용 (String 에서 x부터  y번째 전까지만 출력, 나머지는 잘라냄)
	}
	
}
	
//	(실행결과 :)
//	
//	x = 0XAB 		00000000000000000000000010101011
//	y = 0XF 		00000000000000000000000000001111
//	0XAB | 0XF = 0XAF 	00000000000000000000000010101111
//	0XAB & 0XF = 0XB 	00000000000000000000000000001011
//	0XAB ^ 0XF = 0XA4 	00000000000000000000000010100100
//	0XAB ^ 0XF ^ 0XF = 0XAB 00000000000000000000000010101011
