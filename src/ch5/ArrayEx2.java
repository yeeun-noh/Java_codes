package ch5;

import java.util.*;

public class ArrayEx2 {

	public static void main(String[] args) {

		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
//		int[] arr3 = new int[10] {100, 95, 80, 70, 60};
		int[] arr3 = {100, 95, 80, 70, 60};
		char[] charArr = {'a', 'b', 'c', 'd'};
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣음
		}

		for(int i=0; i<arr2.length; i++) {
			arr2[i] = (int)(Math.random()*10)+1;  // 1~10의 값을 배열에 저장
		}
		
		// 배열에 저장된 값들을 출력:
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+ ", "); // '1, 2, 3, 4, 5, 6, 7, 8, 9, 10,' 출력
		}
		System.out.println(); //
		System.out.println(Arrays.toString(arr2)); // '[1, 1, 4, 9, 9, 5, 4, 3, 5, 1]' (랜덤)
		System.out.println(Arrays.toString(arr3)); // 배열 arr3의 모든요소 '[100. 95, 80, 70, 60]' 이 출력
		System.out.println(Arrays.toString(charArr)); // '[a, b, c, d]' 출력
		System.out.println(arr3); //  배열을 가리키는 참조변수 arr3의 값, '[I@cac736f' 출력
		System.out.println(charArr); //'abcd' 출력 : char배열만 println메서드로 출력하면 각 요소가 구분자없이 그대로 출력됨
	}

}
