package ch4;

import java.util.Scanner;

public class FlowExx26 {

	public static void main(String[] args) {
		//1부터 몇까지 더하면 누적합계가 100을 넘지않는 제일 큰수가 되는지 알아내는 테스트:
		int sum = 0;
		int i = 0;
		
		// i를 1씩 증가시켜서 sum에 계속 더해나감
		while((sum += ++i) <= 100) {
			System.out.printf("%d, %d%n", i, sum);
		}
		// ((sum += ++i) <= 100)은 밑의 두식을 합쳐놓은것이라고 생각하기 :
		// sum += ++i (i값을 1증가시켜서 sum에 누적)
		// sum <= 100 (sum값이 1000보다 작거나 같은지 확인)
	}

}

//	(실행결과 :)
//
//	1, 1
//	2, 3
//	3, 6
//	4, 10
//	5, 15
//	6, 21
//	7, 28
//	8, 36
//	9, 45
//	10, 55
//	11, 66
//	12, 78
// 	13, 91
