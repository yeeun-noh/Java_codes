package ch3;

public class OperatorExx23 {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "ABC";
		
		System.out.printf("\"abc\"== \"abc\"  ?  %b%n", "abc"=="abc");
		System.out.printf(" str1== \"abc\"  ?  %b%n", str1=="abc");
		System.out.printf(" str2== \"abc\"  ?  %b%n", str2=="abc");
		System.out.printf("str1.equals(\"abc\")  ?  %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\")  ?  %b%n", str2.equals("abc"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\")  ?  %b%n", str2.equalsIgnoreCase("ABC"));
		// equalsIgnoreCase() : 대소문자 구별X	
	}

}

//	(실행결과 :)
//
//	"abc"== "abc"  ?  true
//	 str1== "abc"  ?  true
//	 str2== "abc"  ?  false
//	str1.equals("abc")  ?  true
//	str2.equals("abc")  ?  false
//	str2.equalsIgnoreCase("ABC")  ?  true
