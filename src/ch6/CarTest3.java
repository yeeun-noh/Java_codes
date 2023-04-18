package ch6;

class Car3 {
	String colour;
	String gearType;
	int door;
	
	Car3() {
		this("white", "auto", 4);
	}
	
	Car3(Car3 c) { // 인스턴스의 복사를 위한 생성자
		colour = c.colour;
		gearType = c.gearType;
		door = c.door;
	}
		
	Car3(String colour, String gearType, int door) {
		this.colour = colour;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest3 {

	public static void main(String[] args) {

		Car3 c1 = new Car3();		
		Car3 c2 = new Car3(c1); // c1의 복사본 c2를 생성함
		
		System.out.println("c1의 colour= " + c1.colour + ", gearType= " + c1.gearType + ", door= " + c1.door);
		System.out.println("c2의 colour= " + c2.colour + ", gearType= " + c2.gearType + ", door= " + c2.door);
		
		c1.door = 100; // c1의 인스턴스변수 door의 값을 변경
		System.out.println("c1.door = 100; 수행후");
		System.out.println("c1의 colour= " + c1.colour + ", gearType= " + c1.gearType + ", door= " + c1.door);
		System.out.println("c2의 colour= " + c2.colour + ", gearType= " + c2.gearType + ", door= " + c2.door);	
	}

}

/* (실행결과:)

c1의 colour= white, gearType= auto, door= 4
c2의 colour= white, gearType= auto, door= 4
c1.door = 100; 수행후
c1의 colour= white, gearType= auto, door= 100
c2의 colour= white, gearType= auto, door= 4

*/
