package ch8;

public class ExceptionExx11 {

	public static void main(String[] args) {

		throw new RuntimeException(); //RuntimeException을 고의로 발생시키면, 컴파일은 되지만 실행 도중 비정상적으로 종료됨! 
		// RuntimeException클래스들은 컴파일러가 예외처리를 확인하지 않기 때문! => 'unchecked예외' 라고 불러짐
		// RuntimeException클래스를 제외한 나머지 Exception클래스들은 'checked예외'라고 불러짐
	}
}

/* (실행결과:)

Exception in thread "main" java.lang.RuntimeException
	at ch8.ExceptionExx11.main(ExceptionExx11.java:7)

*/
