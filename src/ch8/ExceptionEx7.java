package ch8;
// 예외의 최고조상인 Exception을 처리하는 catch블럭은 모든 종류의 예외를 처리 할수 있음
// (try-catch문의 마지막에 Exception클래스 타입의 참조변수를 선언한 catch블럭을 사용하면, 여러종류의 예외가 발생하더라도, 이 catch블럭에 의해 처리되도록 할 수있음!)

public class ExceptionEx7 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); 	//0으로 나눠서 고의로 ArithmeticException 발생시킴!
			System.out.println(4);		//실행되지 않음!
		} catch (ArithmeticException e) {
			if (e instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) { 		 //ArithmeticException을 제외한 모든 예외가 처리됨!
			System.out.println("Exception"); //ArithmeticException을 제외한 예외가 없으므로, 실행되지 않음!
		}
		System.out.println(6);
	}
}

/* (실행결과:)

1
2
3
true
ArithmeticException
6

*/
