package ch4;

import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {

		System.out.print("숫자를 하나 입력하세요 >>");

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println("입력한 숫자: 0");
		} else {
			System.out.println("입력한 숫자: 0아님");
		}
	}

}

//	(실행결과 :)
//
//	숫자를 하나 입력하세요 >>0
//	입력한 숫자: 0
