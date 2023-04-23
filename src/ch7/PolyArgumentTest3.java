package ch7;
// Vector클래스와 Vector클래스의 주요 메서드 : 
// - (1)boolean add(Object o)
// - (2)boolean remove(Object o)
// - (3)boolean isEmpty()
// - (4)int size()
// - (5)Object get(int index)

import java.util.Vector; //Vector클래스를 사용하기 위해서 추가

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product() {} //기본생성자
}

class Tv_class extends Product {
	Tv_class() {
		//조상클래스의 생성자 Product(int price)를 호출함:
		super(100); //Tv의 가격은 100
	}
	
	//Object클래스의 toString()을 오버라이딩함:
	public String toString() {
		return "Tv";
	}
}

class Computer_class extends Product {
	Computer_class() {
		//조상클래스의 생성자 Product(int price)를 호출함
		super(200); //컴퓨터의 가격은 200
	}
	
	//Object클래스의 toString()을 오버라이딩함:
	public String toString() {
		return "Computer";
	}
}

class Audio_class extends Product {
	Audio_class() {
		super(50);
	}
	
	//Object클래스의 toString()을 오버라이딩함:
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Vector cart = new Vector(); //구입한 제품을 저장하는데 사용될 Vector객체
	// Vector vectorname = new Vector();
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		cart.add(p); //구입한 제품을 Vector에 저장
//		(1)Vector클래스의 주요 메서드:
//		boolean add(Object o): vector에 객체를 저장, 추가에 성공하면 결과값으로 true 실패하면 false를 반환
		
		System.out.println(p + "을/를 구매하셨습니다.");
	}
	
	void refund(Product p) {
		if(cart.remove(p)) {
			money += p.price; //제품을 Vector에서 제거
//			(2)Vector클래스의 주요 메서드:
//			boolean remove(Object o): vetor에 저장되어 있는 객체를 제거, 제거에 성공하면 true 실패하면 false를 반환
			
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String cartList = "";
		
		if(cart.isEmpty()) { //Vector가 비어있는지 확인
//			(3)Vector클래스의 주요 메서드:
//			boolean isEmpty(): vetor가 비어있는지 검사, 비어있으면 true 비어있지 않으면 false를 반환
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i=0; i<cart.size(); i++) { //Vector에 저장된 객체의 개수를 반환
//		(4)Vector클래스의 주요 메서드:
//		int size(): vetor에 저장된 객체의 개수를 반환
			
			Product p = (Product)cart.get(i); //Vector의 i번째에 있는 객체를 얻어옴
//			(5)Vector클래스의 주요 메서드:
//			Object get(int index): 지정된 위치(index)에 객체를 반환, 반환타입이 Object이므로 적절한 타입으로의 형변환이 필요함!

			sum += p.price;
			cartList += (i==0) ? (p) : (", " + p); //조건식 ? 식1(true) : 식2(false) 
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + cartList + "입니다.");
	}
}

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv_class tv = new Tv_class();
		Computer_class computer = new Computer_class();
		Audio_class audio = new Audio_class();
		
		b.buy(tv);
		b.buy(computer);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(computer);
		b.summary();
	}
}

/* (실행결과:)

Tv을/를 구매하셨습니다.
Computer을/를 구매하셨습니다.
Audio을/를 구매하셨습니다.
구입하신 물품의 총 금액은 350만원입니다.
구입하신 제품은 Tv, Computer, Audio, 입니다.


*/
