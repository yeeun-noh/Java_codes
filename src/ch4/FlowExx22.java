package ch4;

public class FlowExx22 {

	public static void main(String[] args) {
		// 향상된 for문(enhanced for statement)
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();

		// 윗방법(일반적인 for문) == 아랫방법(향상된 for문)
		for(int j : arr) {
			System.out.printf("%d ", j);
			sum += j;
		}
		
		System.out.println();
		System.out.println("sum= " + sum);
	}

}

//	(실행결과 :)
//
//	10 20 30 40 50 
//	10 20 30 40 50 
//	sum= 150
