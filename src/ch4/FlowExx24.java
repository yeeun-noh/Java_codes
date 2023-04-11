package ch4;

public class FlowExx24 {

	public static void main(String[] args) {
		
		int i = 11;
		
		System.out.println("카운트 다운 Start!");
		
		while(i--!=0) {
			System.out.println(i);
			
			for(int j=0; j<2_000_000_000; j++) {} // 괄호 안에 문장을 넣지 않아도 됨
		}
		System.out.println("Gamr Over!");
	}

}

//	(실행결과 :)
//
//	카운트 다운 Start!
//	10
//	9
//	8
//	7
//	6
//	5
//	4
//	3
//	2
//	1
//	0
//	Gamr Over!
