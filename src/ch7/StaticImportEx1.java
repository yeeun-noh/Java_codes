package ch7;

import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportEx1 {

	public static void main(String[] args) {
//		System.out.println(Math.random());
		out.println(random());
		
//		System.out.println("Math.PI: " + Math.PI);
		out.println("Math.PI: " + PI);
	}
}

/* (실행결과:)

0.908853396828879
Math.PI: 3.141592653589793

*/
