package ch3;

public class OperatorExx29 {

	public static void main(String[] args) {
		
		byte p = 10;
		byte n = -10;
		
		System.out.printf(" p   = %d \t%s%n", p, toBinaryString(p));
		System.out.printf("~p   = %d \t%s%n", ~p, toBinaryString(~p)); // 비트 전환 연산자(~)
		System.out.printf("~p+1 = %d \t%s%n", ~p+1, toBinaryString(~p+1));
		System.out.printf("~~p  = %d \t%s%n", ~~p, toBinaryString(~~p));
//		p = 10; //10 = 00001010
//		~p => 00001010 => 11110101(=-11) : 0을 1로, 1을 0으로 바꿈 => ~p = -11
//		~p + 1 => -11 + 1 => (11110101 + 00000001 = 11110110) => ~p + 1 = -10 
//		~~p =10
		System.out.println();
		System.out.printf("  n     = %d%n", n);
		System.out.printf(" ~(n-1) = %d%n", ~(n-1));
		// 음의 정수 n이 있을때, n에 대한 양의 정수를 얻으려면 : ~(n-1)
	} // main의 끝 
	
	static String toBinaryString(int x) { // 10진 정수를 2진수로 변환하는 메서드
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x); // Integer.toBinaryString(int i): 정수(10진수)를 2진 문자열로 변환
		return tmp.substring(tmp.length()-32); // substring(int x, int y) : 문자열을 잘라낼때 사용 (String 에서 x부터  y번째 전까지만 출력, 나머지는 잘라냄)
	}

//	(실행결과 :)
//
//	 p   = 10 	00000000000000000000000000001010
//	~p   = -11 	11111111111111111111111111110101
//	~p+1 = -10 	11111111111111111111111111110110
//	~~p  = 10 	00000000000000000000000000001010
//
//	  n      = -10
//	  ~(n-1) = 10
}
