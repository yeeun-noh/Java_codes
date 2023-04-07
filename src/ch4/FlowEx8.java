package ch4;

import java.util.Scanner;

public class FlowEx8 {

	public static void main(String[] args) {

		System.out.println("당신의 주민번호를 입력하세요.(011231-1111222)>"); // '-'의 뒤에 첫번호가 1,3 이면 남자, 2,4 면 여자
		
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		
		char gender = regNo.charAt(7); // 입력받은 번호의 8번째 문자를 gender에 저장
		// 문자열에 저장된 문자는 '문자열.charAt(index)' 로 가져올수 있음
		
		switch(gender) {
		case '1': case '3':
			System.out.println("당신은 남자입니다.");
			break;
		case '2': case '4':
			System.out.println("당신은 여자입니다.");
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
		}
	}
	
}
