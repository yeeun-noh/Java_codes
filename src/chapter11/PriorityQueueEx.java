package chapter11;
// 우선순위 큐(PriorityQueue) - 저장한 순서에 관계없이 우선순위(Priority)가 높은 것부터 꺼냄 

import java.util.*;

public class PriorityQueueEx {

	public static void main(String[] args) {

		Queue pq = new PriorityQueue();
		pq.offer(3); //pq.offer(new Integer(3)); => 컴파일러가 Integer로 오토박싱 헤줌!
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		System.out.println(pq); //pq의 내부 배열을 출력
		
		Object obj = null;
		
		//PriorityQueue에 저장된 요소를 하나씩 꺼냄:
		//우선순위는 숫자가 작을수록 높은 것이므로 1이 가장 먼저 출력됨!
		while((obj = pq.poll()) != null)
			System.out.println(obj);
	}
}

/* (실행 결과:)

[1, 2, 5, 3, 4]
1
2
3
4
5

*/
