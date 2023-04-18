package ch6;

class Car2 {
	String colour;
	String gearType;
	int door;
	
	Car2() {
		this("white", "auto", 4);
	}
	
	Car2(String colour) {
		this(colour, "auto", 4);
	}
	
	Car2(String colour, String gearType, int door) {
		this.colour = colour;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {

		Car2 c1 = new Car2();		
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1의 colour= " + c1.colour + ", gearType= " + c1.gearType + ", door= " + c1.door);
		System.out.println("c2의 colour= " + c2.colour + ", gearType= " + c2.gearType + ", door= " + c2.door);
	}

}

/* (실행결과:)

c1의 colour= white, gearType= auto, door= 4
c2의 colour= blue, gearType= auto, door= 4

*/
