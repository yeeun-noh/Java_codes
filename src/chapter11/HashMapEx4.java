package chapter11;
// HashMap

import java.util.*;

public class HashMapEx4 {

	public static void main(String[] args) {

		String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		
		HashMap map = new HashMap();
		
		for(int i=0; i<data.length; i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i], new Integer(value.intValue() + 1));
			} else {
				map.put(data[i], new Integer(1));
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			int value = ((Integer)e.getValue()).intValue();
			System.out.println(e.getKey() + " : " + printBar('#', value) + " " + value);
		}
	}
	
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i=0; i<bar.length; i++)
			bar[i] = ch;
		
		return new String(bar); //Stirng(char[] chArr) 
	}
}

/* (실행 결과:)

* 기타[1]
세탁 010-888-8888

* 친구[3]
이자바 010-111-1111
김자바 010-222-2222
김자바 010-333-3333

* 회사[4]
이과장 010-777-7777
김대리 010-444-4444
김대리 010-555-5555
박대리 010-666-6666

*/
