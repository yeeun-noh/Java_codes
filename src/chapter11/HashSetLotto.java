package chapter11;
// HashSet - 로또번호 만들기

import java.util.*;

public class HashSetLotto {

	public static void main(String[] args) {

		Set set = new HashSet();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45) + 1;
//			set.add(new Integer(num));
			set.add(num); //자동으로 위의 문장을 오토박싱해줌!
		}
		System.out.println(set);

		//set을 순서대로 정렬:
		List list = new LinkedList(set); //LinkedList(Collection c)
		Collections.sort(list);			 //Collections.sort(List list)
		System.out.println(list);
	}
	
}

/* (실행 결과:)

[33, 2, 19, 23, 12, 45]
[2, 12, 19, 23, 33, 45]

*/
