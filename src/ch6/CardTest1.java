package ch6;

class CardTest1 {
	public static void main(String[] args) {
		
		//클래스변수는 객체생성없이 "클래스이름.클래스변수"로 직접 사용가능:
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		//인스턴스변수의 값생성:
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.num = 7;
		
		//인스턴스변수의 값변경:
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.num = 4;
		
		System.out.println("c1은 " + c1.kind + " " + c1.num + ", 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + " " + c2.num + ", 크기는 (" + c2.width + ", " + c2.height + ")");
		
		System.out.println("c1의 width와 height을 각각 50, 80으로 변경!");
		//클래스변수의 값 변경:
		c1.width = 50;
		c1.height = 80;
		//클래스변수는 모든 인스턴스가 하나의 저장공간을 공유하므로 항상 공통된 값을 가짐
		//==> c2.width = 50; c2.height = 80; 으로 변경됨
		
		System.out.println("c1은 " + c1.kind + " " + c1.num + ", 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + " " + c2.num + ", 크기는 (" + c2.width + ", " + c2.height + ")");
	}
}

class Card {
	String  kind;			 // 인스턴스변수
	int num;				 // 인스턴스변수
	static int width = 100;	 // 클래스변수
	static int height = 250; // 클래스변수
}

/* (실행결과:)

Card.width = 100
Card.height = 250
c1은 Heart 7, 크기는 (100, 250)
c2은 Spade 4, 크기는 (100, 250)
c1의 width와 height을 각각 50, 80으로 변경!
c1은 Heart 7, 크기는 (50, 80)
c2은 Spade 4, 크기는 (50, 80)

 */
