package ch8;

public class ExceptionEx1 {

	public static void main(String[] args) {

		try {
			try { } catch (Exception e) {}
		} catch (Exception e) {
			try { } catch (Exception e) {} //에러, 변수e가 중복 선언됨
		} 

		try {
		
		} catch (Exception e) {
		
		}
	}
}
