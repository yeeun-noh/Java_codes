package ch9;
//toString()

public class CardToString {

	public static void main(String[] args) {
		
		Card c1 = new Card();
		Card c2 = new Card();
		
		// toString을 오버라이딩 하지 않았기 때문에 클래스이름과 해시코드가 출력됨 :
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
	
}

class Card {
	String kind;
	int number;
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
}

/* (실행결과:)

ch9.Card@3d012ddd
ch9.Card@626b2d4a

*/
