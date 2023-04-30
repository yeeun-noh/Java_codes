package ch8;
//ExceptionExx12에서 <method1()에서 예외처리한 경우>

public class ExceptionExx14 {

	public static void main(String[] args) throws Exception {

		try {
			method1();
		} catch(Exception e) {
			System.out.println("main메서드에서 예외가 처리되었음");
			e.printStackTrace();
		}
	}
	
	static void method1() throws Exception {
		throw new Exception();
	}
}

/* (실행결과:)

main메서드에서 예외가 처리되었음
java.lang.Exception
	at ch8.ExceptionExx14.method1(ExceptionExx14.java:16)
	at ch8.ExceptionExx14.main(ExceptionExx14.java:8)

*/
