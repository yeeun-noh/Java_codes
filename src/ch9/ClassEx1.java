package ch9;

final class Cards {
	String kind;
	int number;
	
	Cards() {
		this("SPADE", 1);
	}
	
	Cards(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return kind + ":" + number;
	}
}

public class ClassEx1 {

	public static void main(String[] args) throws Exception {

		Cards c1 = new Cards("HEART", 3);		//new연산자로 객체 생성
		Cards c2 = Cards.class.newInstance();	//Class객체를 통해서 객체생성
		
		Class cObj = c1.getClass();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	}
}

/* (실행결과:)

HEART:3
SPADE:1
ch9.Cards
final class ch9.Cards
class ch9.Cards

*/
