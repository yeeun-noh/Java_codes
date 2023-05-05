package chapter11;
// ArrayList와 LinkedList 성능 차이
//	결론:
//	순차적으로 추가/삭제하는 경우에는 ArrayList가 LinkedList보다 빠름
//	중간데이터를 추가/삭제하는 경우에는 LinkedList가 ArrayList보다 빠름

import java.util.*;

public class ArrayListLinkedListTest {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList(2000000);
		LinkedList l1 = new LinkedList();

		System.out.println("= 순차적으로 추가하기 =");
		System.out.println("ArrayList: " + add1(a1));
		System.out.println("LinkedList: " + add1(l1));
		System.out.println();
		System.out.println("= 중간에 추가하기 =");
		System.out.println("ArrayList: " + add2(a1));
		System.out.println("LinkedList: " + add2(l1));
		System.out.println();
		System.out.println("= 중간에서 삭제하기 =");
		System.out.println("ArrayList: " + remove2(a1));
		System.out.println("LinkedList: " + remove2(l1));
		System.out.println();
		System.out.println("= 순차적으로 삭제하기 =");
		System.out.println("ArrayList: " + remove1(a1));
		System.out.println("LinkedList: " + remove1(l1));
		System.out.println();
	}

	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++)
			list.add(i + "");
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++)
			list.add(500, "X");
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for(int i=list.size()-1; i>=0; i--)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
}

/* (실행 결과:)

list1: [5, 4, 2, 0, 1, 3]
list2: [4, 2, 0]
-------------------------------
list1: [0, 1, 2, 3, 4, 5]
list2: [0, 2, 4]
-------------------------------
list1.containsAll(list2) : true
list1: [0, 1, 2, 3, 4, 5]
list2: [0, 2, 4]
-------------------------------
list1: [0, 1, 2, 3, 4, 5]
list2: [0, 2, 4, B, C, A]
-------------------------------
list1: [0, 1, 2, 3, 4, 5]
list2: [0, 2, 4, AA, B, C, A]
-------------------------------
list1.retainAll(list2) : true
list1: [0, 2, 4]
list2: [0, 2, 4, AA, B, C, A]
-------------------------------
list1: [0, 2, 4]
list2: [AA, B, C, A]
-------------------------------
list1: [0, 2, 4]
list2: [AA, C, A]


*/
