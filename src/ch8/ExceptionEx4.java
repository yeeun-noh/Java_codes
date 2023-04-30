package ch8;

public class ExceptionEx4 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);

		} catch (Exception e) {
			System.out.println(5); //예외가 발행하지 않았으므로, catch문장이 실행되지 않음!
		}
		System.out.println(6);
	}
}

/* (실행결과:)

1
2
3
4
6

*/
