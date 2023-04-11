package ch4;

public class FlowExx23 {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(i<5) {
			System.out.print(i + ", ");
			i++;
		}
		
		System.out.println("\n--------------");
		
		i = 5;
		while(i-- != 0) {
			System.out.print(i + ", ");
		}
		
// 		(같은방법:)
// 		while(i!=0) {
// 			i--;
// 			System.out.print(i + ", ");
// 		}
	}

}

//	(실행결과 :)
//
//	0, 1, 2, 3, 4, 
//	--------------
//	4, 3, 2, 1, 0, 
