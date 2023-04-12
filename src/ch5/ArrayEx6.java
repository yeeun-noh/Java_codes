package ch5;

public class ArrayEx6 {

	public static void main(String[] args) {
		// 최대값과 최소값 : 배열의 요소 중에서 제일 큰 값과 제일 작은 값 찾기
		
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0]; // 배열의 첫번째 값으로 최대값을 초기화
		int min = score[0]; // 배열의 첫번째 값으로 최소값을 초기화
		
		for(int i=1; i<score.length; i++) { // 배열의 두번째 요소부터 읽기 위해서 변수i의 값을 1로 초기화(score[0] 과 score[1]부터 비교시작~)
			if(score[i]> max) max = score[i];
			else if(score[i] < min) min = score[i];
		}
		System.out.println("최대값: " + max + ", 최소값: " + min);
	}
	
}

// (실행결과 :)
//
// 최대값: 100, 최소값: 33
