package ch5;

public class MultiArrEx3 {
	public static void main(String[] args) {
//		(3) 행렬의 곱셈 : 두 행렬(matrix)을 곱한 결과를 출력
		int[][] m1 = {
			{1, 2, 3},
			{4, 5, 6}
		};
		
		int[][] m2 = {
				{1, 2},
				{3, 4},				
				{5, 6}
		};

		//두 행렬의 곱셈이 가능하려면, 배열 m1의 열의 길이와 배열m2의 행의 길이가 일치 해야함
		final int ROW 	 = m1.length; 	 //m1의 행 길이
		final int COL 	 = m2[0].length; //m2의 열 길이
		final int M2_ROW = m2.length; 	 //m2의 행 길이
		
		int[][] m3 = new int[ROW][COL];
		
		//행렬곱 m1 x m2의 결과를 m3에 저장:
		//(행렬m1과 m2의 길이가 달라져도 행렬m3가 계산될 수 있도록, 배열m3의 크기와 for문식의 조건식이 동적으로 계산되게함)
		for(int i=0; i<ROW; i++)
			for(int j=0; j<COL; j++)
				for(int k=0; k<M2_ROW; k++)
					m3[i][j] += m1[i][k] * m2[k][j];
		
		//행렬 m3을 출력:
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COL; j++) {
				System.out.printf("%3d ", m3[i][j]);
			}
			System.out.println();
		}
	}
}

/* (실행결과:)

 22  28 
 49  64 

*/
