package ch5;

import java.util.Scanner;

public class MultiArrEx2 {

	public static void main(String[] args) {
//		﻿(2) 빙고 : 빙고판을 만들고 입력받은 숫자를 빙고판에서 지움
//		- 사용자로부터 숫자를 입력받아서 일치하는 숫자가 빙고판에 있으면 해당숫자를 0으로 바꾸기:

		final int SIZE = 5;
		int x = 0, y = 0, num = 0;
		
		int[][] bingo = new int[SIZE][SIZE]; //5x5빙고판
		Scanner sc = new Scanner(System.in);
		
		//배열의 모든요소를 1부터 SIZE*SIZE까지의 숫자로 초기화:
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				bingo[i][j] = i*SIZE + j + 1;
			}
		}
		
		//배열에 저장된 값을 뒤섞기(shuffle):
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				x = (int)(Math.random()*SIZE);
				y = (int)(Math.random()*SIZE);
				
				//bingo[i][j]와 임의로 선택된 값(bingo[x][y])을 바꿈:
				int tmp = bingo[i][j];
				bingo[i][j] =  bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					System.out.printf("%2d ", bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("1~%d의 숫자를 입력,(종료:0)>", SIZE*SIZE);
			String str = sc.nextLine();
			num = Integer.parseInt(str); //문자열(str)을 숫자로 변환
			
			//입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장:
			outer:
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					if(bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer; //2중반복문 벗어남
					}
				}
			}
		} while(num!=0);
	}

}

/* (실행결과:)

22 13 19 17 14 
 8  1 10  3  7 
 4  9 16 25 11 
24 23 15  6 20 
18 12  2  5 21 

1~25의 숫자를 입력,(종료:0)>1
22 13 19 17 14 
 8  0 10  3  7 
 4  9 16 25 11 
24 23 15  6 20 
18 12  2  5 21 

1~25의 숫자를 입력,(종료:0)>22
 0 13 19 17 14 
 8  0 10  3  7 
 4  9 16 25 11 
24 23 15  6 20 
18 12  2  5 21 

1~25의 숫자를 입력,(종료:0)>0

*/
