package ch3;

public class OperatorExx17 {

	public static void main(String[] args) {
		
		double pi = 3.141592;
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0; // double이기 때문에 1000.0으로 입력
//		(int)(pi * 1000 + 0.5) / 1000.0;
//		-> (int)(3141.592 + 0.5) / 1000.0;
//		-> (int)(3142.092) / 1000.0;
//		-> 3142 / 1000.0;
//		-> 3142.0 / 1000.0
//		-> 3.142		
		
		System.out.println(shortPi); // 3.142
	}

}
