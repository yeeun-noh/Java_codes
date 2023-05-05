package chapter11;
// 큐(Queue) - "FIFO" => offer(), poll()

import java.util.*;

public class QueueEx1 {

	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; //MAX_SIZE에 최대 5까지만 저장되도록 함
	
	public static void main(String[] args) {

		System.out.println("help를 입력하면 도움말을 볼수 있습니다");
		while(true) {
			System.out.print(">> ");
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
			
				if("".equals(input))
					continue;
				
				if(input.equalsIgnoreCase("q"))
					System.exit(0); //종료
				else if(input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다");
					System.out.println("q 또는 Q - 프로그램을 종료합니다");
					System.out.println("histoty - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다");
				}
				else if(input.equalsIgnoreCase("history")) {
					int i = 0;
					//입력받은 명령어 저장:
					save(input);
					
					//LinkedList의 내용을 보여줌:
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext())
						System.out.println(++i + ". " + it.next());
				}
				else {
					save(input);
				}
			} catch(Exception e) {
				System.out.println("입력오류입니다");
			}
		}
	}

	private static void save(String input) {
		//Queue에 저장:
		if(!"".equals(input))
			q.offer(input);
		
		//Queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제(FIFO):
		if(q.size() > MAX_SIZE) //size()는 Collection인터페이스에 정의
			q.remove();
	}
}

/* (실행 결과:)

help를 입력하면 도움말을 볼수 있습니다
>> HELP
help - 도움말을 보여줍니다
q 또는 Q - 프로그램을 종료합니다
histoty - 최근에 입력한 명령어를 5개 보여줍니다
>> 1
>> 2
>> 3
>> 4
>> 5
>> history
1. 2
2. 3
3. 4
4. 5
5. history
>> q

*/
