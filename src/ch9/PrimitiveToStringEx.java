package ch9;
//String 클래스 - 문자열과 기본형간의 변환의 예

public class PrimitiveToStringEx {

	public static void main(String[] args) throws Exception {
		
		int iVal = 100;
		String strVal = String.valueOf(iVal); //int를 String으로 변환
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; // String으로 변환하는 또 다른방법
		
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal, " + ", strVal2, " = ")+ sum);
		System.out.println(strVal + " + " + strVal2 + " = " + sum2);
	}
	
}

/* (실행결과:)

100 + 200.0 = 300.0
100 + 200.0 = 300.0

*/

