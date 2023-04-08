package exercise;

import java.util.Scanner;

public class OperatorExx25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		
		System.out.println("문자 하나 입력>>");
		
		String input = sc.nextLine();
		ch = input.charAt(0);
		
		if('0' <= ch && ch <= '9') {
			System.out.println("입력하신 문자 : 숫자");
		}
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("입력하신 문자 : 영문자");
		}
	} // main
}
