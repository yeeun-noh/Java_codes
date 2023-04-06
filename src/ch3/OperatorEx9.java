package ch3;

public class OperatorEx9 {

	public static void main(String[] args) {
		
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a= " + a); //a= -727379968
		System.out.println("b= " + b); //b= 1000000000000
	}

}
