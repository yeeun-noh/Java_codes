package ch9;
//clone() - 배열복사

import java.util.*;

public class CloneEx2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int[] arrClone = arr.clone(); //배열 arr을 복제해서 같은 내용의 새로운 배열을 만듬
		arrClone[0] = 6;
		
		//위의코드를 System.arraycopy()를 이용해서 내용을 복사해도 결과는 같음:
		int[] arr2 = {1,2,3,4,5};
		int[] arr2Clone = new int[arr2.length];
		System.arraycopy(arr2, 0, arr2Clone, 0, arr2.length);
		arr2Clone[0] = 6;

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		System.out.println("------------------------");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));		
	}

}

/* (실행결과:)

[1, 2, 3, 4, 5]
[6, 2, 3, 4, 5]
------------------------
[1, 2, 3, 4, 5]
[6, 2, 3, 4, 5]

*/

