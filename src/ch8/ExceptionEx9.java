package ch8;
// throw를 사용해서 고의로 예외 발생시키기

public class ExceptionEx9 {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("고의로 발생시켰음");
			throw e; //예외를 발생시킴
		// 위의 두줄을 한줄로 줄여쓰기 가능 => throw new Exception("고의로 발생시켰음");

		} catch(Exception e) {
			System.out.println("에러메세지: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음");
	}
}

/* (실행결과:)

에러메세지: 고의로 발생시켰음
java.lang.Exception: 고의로 발생시켰음
	at ch8.ExceptionEx9.main(ExceptionEx9.java:9)
프로그램이 정상 종료되었음

*/
