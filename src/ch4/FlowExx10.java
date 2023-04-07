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
		} // end of switch

		System.out.println("당신의 학점은: " + grade);
	}

}
