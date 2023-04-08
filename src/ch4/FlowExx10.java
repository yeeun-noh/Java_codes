package ch4;

import java.util.Scanner;

public class FlowExx10 {

	public static void main(String[] args) {

		int number = 0;
		char grade = ' ';
		
		System.out.println("성적 입력(1~100) >>");

		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		number = Integer.parseInt(tmp);
		
		switch(number/10) {
			case 10: case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			default:
				grade = 'F';
		} // switch의 끝

		System.out.println("당신은 " + grade + "학점");
	}

}

//	(실행결과 :)
//
//	성적 입력(1~100) >>
//	96
//	당신은 A학점
