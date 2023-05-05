package chapter11;
// Vector

import java.util.*;

public class VectorEx1 {

	public static void main(String[] args) {

		Vector v = new Vector(5); //용량(capacity)이 5인 Vector를 생성
		v.add("1");
		v.add("2");
		v.add("3");
		print(v); //size: 3, capacity: 5
		
		v.trimToSize(); //빈공간 없애기(capacity == size 같아짐)
		System.out.println("== AFTER trimToSize() ==");
		print(v);
		
		v.ensureCapacity(6); //capacity가 최소한 6이 되도록함
		System.out.println("== AFTER ensureCapacity(6) ==");
		print(v);
		
		v.setSize(7); //size가 7이 됨 (capacity가 부족하므로, 자동적으로 기존의크기 6보다 2배의 크기로 증가됨==> capacity: 12됨)(빈 배열에는 null로 채워짐)
		System.out.println("== AFTER setSize(7) ==");
		print(v);
		
		v.clear(); //size가 0이 됨 + 모든요소제삭제
		System.out.println("== AFTER clear() ==");
		print(v);
	}
	
	static void print(Vector v) {
		System.out.println(v);
		System.out.println("size: " + v.size());
		System.out.println("capacity: " + v.capacity());
		System.out.println();
	}
	
}

/* (실행 결과:)

[1, 2, 3]
size: 3
capacity: 5

== AFTER trimToSize() ==
[1, 2, 3]
size: 3
capacity: 3

== AFTER ensureCapacity(6) ==
[1, 2, 3]
size: 3
capacity: 6

== AFTER setSize(7) ==
[1, 2, 3, null, null, null, null]
size: 7
capacity: 12

== AFTER clear() ==
[]
size: 0
capacity: 12

*/
