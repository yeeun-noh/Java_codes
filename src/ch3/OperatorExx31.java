package ch3;

public class OperatorExx31 {
	public static void main(String[] args) {
		
		int dec = 1234;
		int hex = 0xABCD;
		int mask = 0xF; // 0xABCD와 비교하기위해, 0xF를 0x000F 로 바꿔서 계산
		
		System.out.printf("hex= %X%n", hex);
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);	
	}

}

//	(실행결과 :)
//	
//	hex= ABCD
// 	D
// 	C
// 	B
// 	A
