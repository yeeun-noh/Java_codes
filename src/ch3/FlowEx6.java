package ch4;

import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {

		System.out.println("현재 월 입력>>");

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("현재의 계절: 봄");
				break;
			case 6: case 7: case 8:
				System.out.println("현재의 계절: 여름");
				break;
			case 9: case 10: case 11:
				System.out.println("현재의 계절: 가을");
				break;
//		default :
			case 12: case 1: case 2:
				System.out.println("현재의 계절: 겨울");
				break;
		}
		
		System.out.println("프로그램 종료");
	}

}
