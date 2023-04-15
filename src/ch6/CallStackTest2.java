package ch6;

public class CallStackTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작!");
		firstMethod();
		System.out.println("main(String[] args)이 끝!");
	}

	static void firstMethod() {
		System.out.println("firstMethod()가 시작++");
		secondMethod();
		System.out.println("firstMethod()가 끝++");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()가 시작 *");
		System.out.println("secondMethod()가 끝 *");
	}
}

/* (실행결과:)

main(String[] args)이 시작!
firstMethod()가 시작++
secondMethod()가 시작 *
secondMethod()가 끝 *
firstMethod()가 끝++
main(String[] args)이 끝!

 */
