package ch9;
//String 클래스 - join()과 StringJoiner

import java.util.StringJoiner;

public class StringEx4 {

	public static void main(String[] args) throws Exception {
		
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");  //문자열을 ','를 구분자로 나눠서 배열에 저장
		//arr[0] = "dog"
		//arr[1] = "cat"
		//arr[2] = "bear"

		String str = String.join("-", arr); //배열을 문자열 '-'로 구분해서 결합
		System.out.println(str); //"dog-cat-bear"
		System.out.println("------------------------");
		
		String[] arr2 = {"aaa", "bbb", "ccc"};
		StringJoiner sj = new StringJoiner("/", "[", "]");

		for(String s : arr2)
			sj.add(s.toUpperCase());
		System.out.println(sj.toString()); //[AAA/BBB/CCC]
	}
	
}

/* (실행결과:)

dog-cat-bear
------------------------
[AAA/BBB/CCC]

*/

