package chapter11;
// ArrayList
// 긴 문자열 데이터를 원하는 길이로 잘라서 ArrayList에 담은 후 출력 :

import java.util.*;

public class ArrayListEx2 {

	public static void main(String[] args) {

		final int LIMIT = 10; //자르고자 하는 글자의 개수를 지정
		String source = "0123456789abcdefghigABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT + 10); //크기를 여유있게 정함
		
		for(int i=0; i<length; i+=LIMIT) {
			if(i+LIMIT < length)
				list.add(source.substring(i, i+LIMIT));
			else
				list.add(source.substring(i));
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("source.length: " + length);
		System.out.println("list.size(): " + list.size());
	}
	
}

/* (실행 결과:)

0123456789
abcdefghig
ABCDEFGHIJ
!@#$%^&*()
ZZZ
source.length: 43
list.size(): 5

*/
