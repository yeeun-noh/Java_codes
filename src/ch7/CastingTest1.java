package ch7;

public class CastingTest1 {

	public static void main(String[] args) {

		Car car = null; //==Car타입의 참조변수 car을 선언하고 null로 초기화
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car = (Car)fe; 에서 형변환이 생략된형태임!
//		car.water();			//에러, 상위클래스는 하위클래스를 접근/사용불가!
		fe2 = (FireEngine)car;	//하위클래스가 상위클래스를 참조불가능 (형변환 필요!)
		fe2.water();
	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive. Brrr--");
	}
	
	void stop() {
		System.out.println("!stop!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}

/* (실행결과:)

water!!!
water!!!

*/
