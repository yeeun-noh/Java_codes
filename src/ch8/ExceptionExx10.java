package ch8;

public class ExceptionExx10 {

	public static void main(String[] args) {

		throw new Exception(); //Exception을 고의로 발생시키면, 컴파일 조차 되지 않음! 
	}
}

/* (실행결과:)

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unhandled exception type Exception

	at ch8.ExceptionExx10.main(ExceptionExx10.java:8)

*/
