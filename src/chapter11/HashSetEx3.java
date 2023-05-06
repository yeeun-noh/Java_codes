package chapter11;
// HashSet

import java.util.*;

public class HashSetEx3 {

	public static void main(String[] args) {

		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet set1= new HashSet();  //합집합(addAll)
		HashSet set2 = new HashSet(); //교집합(retainAll)
		HashSet set3 = new HashSet(); //차집합(removeAll)
		
		setA.add("1"); setA.add("2"); setA.add("3"); setA.add("4"); setA.add("5");
		System.out.println("A = " + setA);
		
		setB.add("4"); setB.add("5"); setB.add("6"); setB.add("7"); setB.add("8");
		System.out.println("B = " + setB);
		
		//합집합(addAll):
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp))
				set1.add(tmp);
		}
		
		//차집합(removeAll):
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				set3.add(tmp);
		}
		
		//교집합(retainAll):
		it = setA.iterator();
		while(it.hasNext()) {
			set2.add(it.next());
		}
		
		it = setB.iterator();
		while(it.hasNext()) {
			set2.add(it.next());
		}
		
		System.out.println("합집합(addAll): " + set1);
		System.out.println("교집합(retainAll): " + set2);
		System.out.println("차집합(removeAll): " + set3);
	}
	
}

/* (실행 결과:)

A = [1, 2, 3, 4, 5]
B = [4, 5, 6, 7, 8]
합집합(addAll): [4, 5]
교집합(retainAll): [1, 2, 3, 4, 5, 6, 7, 8]
차집합(removeAll): [1, 2, 3]

*/
