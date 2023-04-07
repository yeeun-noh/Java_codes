package ch3;

public class OperatorExx16 {

	public static void main(String[] args) {

		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000) / 1000f;
//		(int)(pi * 1000) / 1000f;
//		-> (int)(3141.592f) / 1000f;
//		-> 3141 / 1000f;
//		-> 3.141f

		System.out.println(shortPi); // 3.141
	}

}
