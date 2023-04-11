package ch4;

import java.util.Scanner;

public class FlowExx32 {

	public static void main(String[] args) {

		int menu = 0;
		Scanner sc = new Scanner(System.in);
		
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
			
			System.out.println("선택하신 메뉴: " + menu + " 번");
		}
	}

}
