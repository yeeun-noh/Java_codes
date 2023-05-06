package chapter11;
// HashMap

import java.util.*;

public class HashMapEx2 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		
		Set set = map.entrySet(); //entrySet(): key와 value를 엔트리(key와 value의 결합)의 형태로 Set에 저장해서 반환
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)(it.next());
			System.out.println("name: " + e.getKey() + ", score: " + e.getValue());
		}
		System.out.println();
		
		set = map.keySet();
		System.out.println("참가자 명단: " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + (float)total/set.size());
		System.out.println("최고점수: " + Collections.max(values));
		System.out.println("최저점수: " + Collections.min(values));	
	}
	
}

/* (실행 결과:)

name: 안자바, score: 90
name: 김자바, score: 100
name: 강자바, score: 80
name: 이자바, score: 100

참가자 명단: [안자바, 김자바, 강자바, 이자바]
총점: 370
평균: 92.5
최고점수: 100
최저점수: 80

*/
