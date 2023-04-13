package ch5;

public class ArrayExx18 {

	public static void main(String[] args) {
		// 2차원배열의 모든요소의 합 구하기:
		
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[j].length; j++) {
				System.out.printf("score[%d][%d]= %d%n", i, j, score[i][j]);
			}
		}
		
		for(int[] tmp : score) { //score의 각요소(1차원배열주소)를 tmp에 저장
			for(int i: tmp) { // tmp는 1차원배열을 가리키는 함수
				sum += i; // 모든 i(==tmp안의값)들이 더해짐
			}
		}
		System.out.println("sum= " + sum);
	}

}

/* (실행결과:)

score[0][0]= 100
score[0][1]= 100
score[0][2]= 100
score[1][0]= 20
score[1][1]= 20
score[1][2]= 20
score[2][0]= 30
score[2][1]= 30
score[2][2]= 30
score[3][0]= 40
score[3][1]= 40
score[3][2]= 40
sum= 570

*/
