package chapter11;
// ArrayList

import java.util.*;


public class ArrayListEx1 {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//list1의 1~4번째를 list2에 저장:
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);

		System.out.println("-------------------------------");
		
		//list1과 list2를 순서대로 정렬 (Collections.sort(List l)):
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);

		System.out.println("-------------------------------");
		
		//list1이 list2의 모든 요소를 포함하고 있을 때만 true:
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		print(list1, list2);

		System.out.println("-------------------------------");
		
		list2.add("B");
		list2.add("C");
		list2.add("A");
		print(list1, list2);
		
		System.out.println("-------------------------------");
		
		list2.add(3, "AA");
		print(list1, list2);
		
		System.out.println("-------------------------------");	
		
		//list1에서 list2와 곂치는 부분만 남기고 나머지는 삭제함:
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		print(list1, list2);

		System.out.println("-------------------------------");

		//list2에서 list1에 포함된 객체들을 삭제함:
		for(int i= list2.size()-1; i>=0; i--) {
//  for(int i=0; i<list2.size(); i++) { //위의코드를 사용한이유 ==> n번째 자리를 삭제하면 n번째 자리이후부터 앞으로 당겨짐(자리이동 있음) 그래서 뒤부터 삭제하면, 자리 이동없음!		
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
		System.out.println("-------------------------------");
		
		//list2에서 index 1자리 삭제함:
		list2.remove(1);
		print(list1, list2);		
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
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
