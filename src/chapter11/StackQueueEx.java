package chapter11;
// 스택(Stack) - "LIFO" => push(), pop()
// 큐(Queue) - "FIFO" => offer(), poll()

import java.util.*;

public class StackQueueEx {

	public static void main(String[] args) {

		Stack st = new Stack();
		Queue q = new LinkedList(); //Queue인터페이스의 구현제인 LinkedList사용!
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while(!st.empty())
			System.out.println(st.pop());
		System.out.println();
		System.out.println("= Queue =");
		while(!q.isEmpty())
			System.out.println(q.poll());
	}
}

/* (실행 결과:)

= Stack =
2
1
0

= Queue =
0
1
2

*/
