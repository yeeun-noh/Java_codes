package ch5;

public class ArrayExx14 {

	public static void main(String[] args) {

		String str = "ABCDE";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i); // str의 i번째 문자를 ch에 저장
			System.out.println("str.charAt(" + i + ") : " + ch);
		}
		
		char[] chArr = str.toCharArray(); // String을 char[]로 변환
		System.out.println(chArr); // char배열(char[])을 출력
	}

}

/* (실행결과:)

str.charAt(0) : A
str.charAt(1) : B
str.charAt(2) : C
str.charAt(3) : D
str.charAt(4) : E
ABCDE

*/
