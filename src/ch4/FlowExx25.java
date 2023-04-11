package ch4;

import java.util.Scanner;

public class FlowExx25 {

	public static void main(String[] args) {
		
		int num = 0, sum = 0;
		System.out.print("숫자 입력 (예:12345)>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			sum += num%10; // 12345%10 => 5
			System.out.printf("sum=%3d, num= %d%n", sum, num);
			
			num /= 10; // 12345/10 => 1234
		}
		System.out.println("각 자리수의 합: " + sum);
	}

}

//	(실행결과 :)
//
//	숫자 입력 (예:12345)>12345
//	sum=  5, num=12345
//	sum=  9, num=1234
//	sum= 12, num=123
//	sum= 14, num=12
//	sum= 15, num=1
//	각 자리수의 합: 15
