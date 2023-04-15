package ch6;

// 대표적인 재귀호출의 예시: 팩토리얼(factorial) 구하기
// f(n) = n * f(n-1), 단 f(1) = 1
public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(4);
		
		System.out.println(result);
	}
	
	static int factorial(int n) {
		int result = 0;
		
		if(n==1) result = 1;
		else result = n * factorial(n-1); //다시 메서드 자신을 호출
		
		return result;
		
	}
}

/* (실행결과:)

24

*/
