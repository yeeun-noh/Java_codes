package ch8;
// ArithmeticException : 산술연산과정에서 오류가 있을 때 발생하는 예외 (정수는 0으로 나누는 것이 금지되어있음)

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		int number = 100;
		int result = 0;
		
		for(int i=0; i< 10; i++) {
			result = number / (int)(Math.random()*10);
			System.out.println(result);
		}
	}
}

/* (실행결과:)

20
100
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ch8.ExceptionEx2.main(ExceptionEx2.java:11)

*/
