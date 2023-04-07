package ch3;

public class OperatorExx18 {

	public static void main(String[] args) {
		
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		// Math.round()를 사용하면, 좀 더 간단히 반올림 가능
//		Math.round(pi * 1000) / 1000.0;
//		-> Math.round(3.141592 * 1000) / 1000.0;
//		-> Math.round(3141.592) / 1000.0;  => 소수점 첫째자리에서 반올림
//		-> 3142 / 1000.0;
//		-> 3.142

		System.out.println(shortPi); // 3.142
	}

}
