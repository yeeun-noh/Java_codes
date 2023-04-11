package ch4;

import java.util.Scanner;

public class FlowExx34 {

	public static void main(String[] args) {

		int menu = 0, num = 0;
		Scanner sc = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(2) log");
			System.out.print("원하는 메뉴(1~3) 선택,(종료:0)>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			} else if(!(1 <= menu && menu <=3)) {
				System.out.println("잘못된 메뉴 선택, (종료:0)");
				continue;
			}
			
			for(;;) {
				System.out.print("계산할 값 입력, (계산종료:0, 전체종료: 99)");
				tmp = sc.nextLine();
				num = Integer.parseInt(tmp);
			
				if(num==0)
					break; // 계산종료, for문 벗어남
				
				if(num==99)
					break outer; // 전체종료, for문과 while문 모두 벗어남
				
				switch(menu) {
					case 1:
						System.out.println("result= " + num*num);
						break;
					case 2:
						System.out.println("result= " + Math.sqrt(num));
						break;
					case 3:
						System.out.println("result= " + Math.log(num));
						break;
				}
			}
		}
	}
	
}
