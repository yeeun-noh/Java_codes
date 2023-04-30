package ch8;
// ExceptionEx5에서 변경

public class ExceptionEx6 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); 	//0으로 나눠서 고의로 ArithmeticException 발생시킴!
			System.out.println(4);		//실행되지 않음!
		} catch (Exception e) { 		//ArithmeticException 대신 Exception 사용!
			System.out.println(5);
		}
		System.out.println(6);
	}
}
// 1,2,3을 출력한 다음, try블럭에서 예외가 발생했기 때문에 try블럭을 바로 벗어나서 'System.out.println(4);' 는 실행되지 않음

/* (실행결과:)

1
2
3
5
6

*/
