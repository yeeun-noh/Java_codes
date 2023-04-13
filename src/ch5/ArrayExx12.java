package ch5;

import java.util.Arrays;

public class ArrayExx12 {

	public static void main(String[] args) {

		String[] names = {"Kim", "Park", "Lee"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+ i + "]: " + names[i]);
		}
		
		String tmp = names[2]; //배열names의 세번째요소를 tmp에 저장
		System.out.println("tmp: " + tmp);
		names[0] = "Noh"; //배열names의 첫번째요소를 "Noh"로 변경
		
		System.out.println(Arrays.toString(names)); // [Noh, Park, Lee]

		for(String str : names) { //향상된 for문
			System.out.print(str + ", "); // Noh, Park, Lee, 
		}
	}

}

/* (실행결과:)

names[0]: Kim
names[1]: Park
names[2]: Lee
tmp: Lee
[Noh, Park, Lee]
Noh, Park, Lee, 

*/
