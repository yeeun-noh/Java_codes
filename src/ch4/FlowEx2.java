package ch4;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		
		int input;
		
		System.out.print("숫자를 하나 입력하세요 >>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
		
		if(input == 0) {
			System.out.println("입력한 숫자: 0");
		}

		if(input != 0) {
			System.out.println("입력한 숫자: 0아님");
			System.out.printf("입력한 숫자: %d", input);
		}
	}

}
