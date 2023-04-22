package ch7;

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
	Product[] cart = new Product[10]; //구입한 제품을 저장하기 위한 배열
	int i = 0; //Product 배열에 사용될 카운터
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p; //제품을 Product[] cart에 저장
		System.out.println(p + "을/를 구매하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String cartList = "";
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null)
				break;
			sum += cart[i].price;
			cartList += cart[i] + ", ";
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + cartList + "입니다.");
	}
}

public class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv_class());
		b.buy(new Computer_class());
		b.buy(new Audio_class());
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
