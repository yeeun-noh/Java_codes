package ch2;

public class SpecialCharEx {

	public static void main(String[] args) {

		System.out.println('\''); // ...처럼 할 수 없다
		System.out.println("abc\t123\b456"); // \b에 의해 3이 지워짐
		System.out.println('\n'); // 개행(new line) 문자를 출력하고 개행
		System.out.println("\'Hello\'"); // 큰따옴표를 출력
		System.out.println("c:\\");
	}

}
