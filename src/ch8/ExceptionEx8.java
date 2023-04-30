package ch8;
// printStackTrace()
// getMessage()

public class ExceptionEx8 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); 	//예외 발생!
			System.out.println(4);		//실행되지 않음!
		} catch (ArithmeticException e) {
			 e.printStackTrace(); 		//참조변수 e를 통해, 생성된 ArithmeticException인스턴스에 접근가능
			System.out.println("예외 메세지: " + e.getMessage());
		}
		System.out.println(6);
	}
}

/* (실행결과:)

1
2
3
java.lang.ArithmeticException: / by zero
	at ch8.ExceptionEx8.main(ExceptionEx8.java:13)
예외 메세지: / by zero
6

*/
