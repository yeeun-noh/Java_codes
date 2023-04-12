package ch5;

public class ArrayEx5 {

	public static void main(String[] args) {
		// 총합과 평균 : 배열의 모든 요소를 더해서 총합과 평균 구하기
		
		int sum = 0;
		float average = 0f; //double도 가능
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i]; // 반복문을 이용해 배열에 저장되어 있는 값들을 모두 더함: 합계 
		}
		average = sum / (float)score.length; // 계산결과를 float으로 얻기위해 형변환해줌
		
		System.out.println("총점: " + sum + ", 평균: " + average);
	}
	
}

// (실행결과 :)
//
// 총점: 478, 평균: 95.6
