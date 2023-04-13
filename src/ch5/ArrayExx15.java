package ch5;

public class ArrayExx15 {

	public static void main(String[] args) {
		// 문자열String을 모르스(morse)부호로 변환:
		
		String str = "SOSHELP";
		String[] morse = { ".-", "-...", "-.-.", "-..", ".",
						"..-.", "--.", "....", "..", ".---",
						"-.-", ".-..", "--", "-.", "---",
						".--.", "--.-", ".-.", "...", "-",
						"..-", "...-", "..-", "-..-", "-.--",
						"--.." };
		String result ="";
		
		for(int i=0; i<str.length(); i++) {
			result += morse[str.charAt(i)-'A']; //i가 0일때 => str.charAt(0)-'A' => 'S'-'A' => 83 - 65 => 18 => morse[18] => "..."
		}
		System.out.println("str: " + str);
		System.out.println("morse: " + result);
	}

}

/* (실행결과:)

str: SOSHELP
morse: ...---.........-...--.

*/
