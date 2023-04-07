package ch4;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력 >>");
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		int com = (int)(Math.random() * 3) + 1; // 1,2,3 중 하나가 com에 저장
		// Math.random()는 난수(=임의의 수)를 얻기 위해 사용
		// 0.0 <= Math.random() < 1.0  : 0.0과 1.0의 범위에 속하는 하나의 double의 값을 반환
		
		// 여기서는 1과 3사이의 정수를 구하기 때문에,
		// 1. 각 변에 3을 곱하고
		// 2. 각 변을 (int)형으로 변환한후
		// 3. 각 변에 1을 더해야함 (1은 포함되고 4는 포함되지 않음)
		// 
		// 0.0 <= Math.random() < 1.0
		// ->1. 0.0 *3 <= Math.random() *3 < 1.0 *3
		// ->   0.0 <= Math.random() *3 < 3.0
		// ->2. (int)0.0 <= (int)(Math.random() *3) < (int)3.0
		// ->   0 <= (int)(Math.random() *3) < 3
		// ->3. 0 +1 <= (int)(Math.random() *3) +1 < 3 +1
		// ->   1 <= (int)(Math.random() *3) < 4
		
		System.out.println("당신은 " + user + "입니다");
		System.out.println("컴퓨터는 " + com + "입니다");

		switch(user-com) {
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
//			break;	//마지막 문장이므로 break를 사용할 필요없음
		}
	}

}
