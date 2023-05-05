package chapter11;
// ArrayList와 LinkedList 성능 차이
// LinkedList는 저장해야하는 데이터의 개수가 많아질수록,
// 데이터를 읽어오는 시간(접근시간, access time)이 길어진다는 단점이 있음!

import java.util.*;

public class ArrayListLinkedListTest2 {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList(2000000);
		LinkedList l1 = new LinkedList();
		add(a1);
		add(l1);
		System.out.println("= 접근시간테스트 =");
		System.out.println("ArrayList: " + access(a1));
		System.out.println("LinkedList: " + access(l1));
	}

	public static void add(List list) {
		for(int i=0; i<100000; i++)
			list.add(i+"");
	}
	
	public static long access(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++)
			list.get(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
}

/* (실행 결과:)

= 접근시간테스트 =
ArrayList: 0
LinkedList: 88

*/
