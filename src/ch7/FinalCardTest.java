package ch7;

class Cards {
	final int NUMBER;	//상수지만 선언과 함께 초기화 하지 않고,
	final String KIND;	//생성자에서 단 한번만 초기화 할 수 있음!
	static int width = 100;
	static int height = 250;
	
	Cards(String kind, int num) {
		//매개변수로 넘겨받은 값으로 KIND와 NUMBER을 초기화:
		KIND = kind;
		NUMBER = num;
	}
	
	Cards() {
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class FinalCardTest {

	public static void main(String[] args) {
		
		Cards c = new Cards("HEART", 10);
//		c.NUMBER = 5;   //에러, cannot assign a value to final variable NUMBER
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); //==> System.out.println(c.toString());
	}

}

/* (실행결과:)

HEART
10
HEART 10

*/
