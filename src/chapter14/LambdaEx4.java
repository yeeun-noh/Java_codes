package chapter14;
//컬렉션 프레임워크와 함수형 인터페이스

import java.util.*;

public class LambdaEx4 {
	
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++)
			list.add(i);
		
		//list의 모든 요소를 출력:
		list.forEach(i-> System.out.print(i + ", "));
		System.out.println();
		
		//list에서 2 또는 3의 배수를 제거:
		list.removeIf(i-> i%2==0 || i%3==0);
		System.out.println(list);
		
		//list의 각 요소에 10을 곱함:
		list.replaceAll(i-> i*10);
		System.out.println(list);
		
		//map의 모든 요소를 출력:
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		System.out.println(map);
		
		//map의 모든 요소를 {k,v}의 형식으로 출력:
		map.forEach((k,v)-> System.out.print("{" + k + "," + v + "},"));		
	}
}

/* (실행결과:)

0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
[1, 5, 7]
[10, 50, 70]
{1=1, 2=2, 3=3, 4=4}
{1,1},{2,2},{3,3},{4,4},

*/
