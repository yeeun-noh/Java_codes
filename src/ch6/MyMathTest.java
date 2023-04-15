package ch6;

public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L); // double로 자동형변환됨
		
		
		System.out.println("add(5L, 3L)= " + result1);
		System.out.println("substract(5L, 3L)= " + result2);
		System.out.println("multiply(5L, 3L)= " + result3);
		System.out.println("divide(5L, 3L)= " + result4);
	}
}
	
class MyMath {
		long add(long a, long b) {
			long result = a + b;
			return result;
		//	return a + b;	//위의 두줄을 한줄로 간단히 할수있음!
		}
		long substract(long a, long b) { return a - b; };
		long multiply(long a, long b) { return a * b; };
		double divide(double a, double b) { return a / b; };
}

/* (실행결과:)

add(5L, 3L)= 8
substract(5L, 3L)= 2
multiply(5L, 3L)= 15
divide(5L, 3L)= 1.6666666666666667

 */
