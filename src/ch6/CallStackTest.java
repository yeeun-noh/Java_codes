package ch6;

public class CallStackTest {
	public static void main(String[] args) {
		firstMethod();
	}

	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}

/* (실행결과:)

secondMethod()

 */
