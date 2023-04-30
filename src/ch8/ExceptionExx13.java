package ch8;
//ExceptionExx12에서 <method1()에서 예외처리한 경우>

public class ExceptionExx13 {

	public static void main(String[] args) throws Exception {

		method1();
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었음");
			e.printStackTrace();
		}
	}
}

/* (실행결과:)

method1메서드에서 예외가 처리되었음
java.lang.Exception
	at ch8.ExceptionExx13.method1(ExceptionExx13.java:12)
	at ch8.ExceptionExx13.main(ExceptionExx13.java:7)

*/
