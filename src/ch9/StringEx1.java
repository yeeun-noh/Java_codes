package ch9;
//String 클래스 - 문자열 비교

public class StringEx1 {

	public static void main(String[] args) throws Exception {

		String str1 = "abc";  //(1)문자열 리터럴 "abc"의 주소가 str1에 저장
		String str2 = "abc";  //(1)문자열 리터럴 "abc"의 주소가 str2에 저장
		String str3 = new String("abc");  //(2)새로운 String인스턴스를 생성
		String str4 = new String("abc");  //(2)새로운 String인스턴스를 생성

		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
		System.out.println("------------------------");
		System.out.println("str3: " + str3);
		System.out.println("str4: " + str4);
		System.out.println("str3 == str4 : " + (str3 == str4));
		System.out.println("str3.equals(str4) : " + (str3.equals(str4)));
	}
}

/* (실행결과:)

str1: abc
str2: abc
str1 == str2 : true
str1.equals(str2) : true
------------------------
str3: abc
str4: abc
str3 == str4 : false
str3.equals(str4) : true

*/

