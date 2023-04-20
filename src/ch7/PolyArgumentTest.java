package ch7;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv_class extends Product {
	Tv_class() {
		//조상클래스의 생성자 Product(int price)를 호출함:
		super(100); //Tv의 가격은 100만원
	}
	
	//Object클래스의 toString()을 오버라이딩함:
	public String toString() {
		return "Tv_class";
	}
}

class Computer_class extends Product {
	Computer_class() {
		//조상클래스의 생성자 Product(int price)를 호출함
		super(200); //컴퓨터의 가격은 200만원
	}
	
	//Object클래스의 toString()을 오버라이딩함:
	public String toString() {
		return "Computer_class";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구매하셨습니다.");
	}
}

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv_class());
		b.buy(new Computer_class());
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
	}
}

/* (실행결과:)

Tv_class을/를 구매하셨습니다.
Computer_class을/를 구매하셨습니다.
현재 남은 돈은 700만원입니다.
현재 보너스 점수는 30점입니다.

*/
