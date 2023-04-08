package ch3;

public class OperatorExx30 {

	// 10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x); // Integer.toBinaryString(int i): 정수(10진수)를 2진 문자열로 변환
		return tmp.substring(tmp.length()-32); // substring(int x, int y) : 문자열을 잘라낼때 사용 (String 에서 x부터  y번째 전까지만 출력, 나머지는 잘라냄)
	}
	
	public static void main(String[] args) {
		int dec = 8;
		
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0)); // 자리 이동: 없음
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1)); // 자리 이동: 오른쪽으로 1번
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2)); // 자리 이동: 오른쪽으로 2번
		System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0)); // 자리 이동: 없음
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1)); // 자리 이동: 왼쪽으로 1번
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2)); // 자리 이동:쪽왼쪽으로 2번
		System.out.println();
		
		dec = -8;
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0)); // 4d인 이유는 숫자+부호 까지 4자리가 나오기 때문에 4자리 출력 
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
		System.out.println();

		dec = 8;
		System.out.printf("%d >> %2d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0)); // 2d인 이유는 두자리만 출력
		System.out.printf("%d >> %2d = %4d \t%s%n", dec, 32, dec >> 32, toBinaryString(dec >> 32));
	} // main의 끝
	
}
  
//	(실행결과 :)
//	
//	8 >> 0 =    8 	00000000000000000000000000001000
//	8 >> 1 =    4 	00000000000000000000000000000100
//	8 >> 2 =    2 	00000000000000000000000000000010
//	8 << 0 =    8 	00000000000000000000000000001000
//	8 << 1 =   16 	00000000000000000000000000010000
//	8 << 2 =   32 	00000000000000000000000000100000
//
//	-8 >> 0 =   -8 	11111111111111111111111111111000
//	-8 >> 1 =   -4 	11111111111111111111111111111100
//	-8 >> 2 =   -2 	11111111111111111111111111111110
//	-8 << 0 =   -8 	11111111111111111111111111111000
//	-8 << 1 =  -16 	11111111111111111111111111110000
//	-8 << 2 =  -32 	11111111111111111111111111100000
//
//	8 >>  0 =    8 	00000000000000000000000000001000
//	8 >> 32 =    8 	00000000000000000000000000001000
