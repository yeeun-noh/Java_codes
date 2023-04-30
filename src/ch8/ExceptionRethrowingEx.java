package ch8;

public class ExceptionRethrowingEx {

	public static void main(String[] args) {

		try {
			method1();
		} catch(Exception e) {
			System.out.println("main메서드에서 예외가 처리됨");
		}
		System.out.println("------------------------------------");
		try {
			method2();
		} catch(Exception e) {
			System.out.println("main메서드에서 예외가 처리됨");
		}

	}

	static void method1() throws Exception{
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1()메서드에서 예외가 처리됨");
			throw e; //다시 예외를 발생시킴!
		}
	}

	static int method2() throws Exception{
		try {
			System.out.println("method2()이 호출됨");
			return 0; //현재 실행 중인 메서드를 종료함
		} catch(Exception e) {
			e.printStackTrace();
//			return 1; //catch블럭 내에도 return문이 필요함
			throw new Exception(); //return문 대신 예외를 호출한 메서드로 전달함
		} finally {
			System.out.println("method2()의 fianlly블럭이 실행됨");
		}
	}
	
	
}

/* (실행결과:)

method1()메서드에서 예외가 처리됨
main메서드에서 예외가 처리됨
------------------------------------
method2()이 호출됨
method2()의 fianlly블럭이 실행됨

*/
