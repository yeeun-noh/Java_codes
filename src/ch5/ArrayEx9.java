package ch5;

import java.util.Arrays;

public class ArrayEx9 {

	public static void main(String[] args) {
		// 임의의 값으로 배열 채우기 : 연속 또는 불연속적인 값들로 배열을 초기화하기
		
		int[] code = {-4, -1, 3, 6, 11}; // 불연속적인 값들로 구성된 배열
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int tmp = (int)(Math.random()*code.length);
		//  int tmp = (int)(Math.random()*5); // code.length==5
			arr[i] = code[tmp];
		}
		System.out.println(Arrays.toString(arr));
	}
	
}

// (실행결과 :)
//
// [11, -4, -4, -4, 11, 3, 11, -1, 6, -1] (실행할 때 마다 달라짐)
