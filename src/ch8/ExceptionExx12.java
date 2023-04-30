package ch8;
// 예외가 발생한 메서드에서 예외처리를 하지 않고 자신을 호출한 메서드에게 예외를 넘겨줄 수는 있지만,
// 이것으로 예외처리된 것은 아니고 예외를 단순히 전달만 하는 것!
// 결국 어느 한 곳에서는 반드시 try-catch 문으로 예외처리를 해주어야함!

public class ExceptionExx12 {

	public static void main(String[] args) throws Exception {

		method1(); //같은클래스내의 static멤버이므로, 객체생성없이 직접 호출가능
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}
}

/* (실행결과:)

Exception in thread "main" java.lang.Exception
	at ch8.ExceptionExx12.method2(ExceptionExx12.java:15)
	at ch8.ExceptionExx12.method1(ExceptionExx12.java:11)
	at ch8.ExceptionExx12.main(ExceptionExx12.java:7)

*/
