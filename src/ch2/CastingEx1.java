package ch2;

public class CastingEx1 {

	public static void main(String[] args) {
		
		double d = 85.4;
		int score = (int)d; // double타입의 변수 d를 int타입으로 형변환
		
		System.out.println("score = " + score);
		System.out.println("d = " + d); // 형변환 후에도 피연산자에는 아무런 변화 없음
	}

}
