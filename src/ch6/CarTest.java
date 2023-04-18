package ch6;

class Car {
	String colour;
	String gearType;
	int door;
	
	Car() {}
	
	Car(String c, String g, int d) {
		colour =c;
		gearType = g;
		door = d;
	}
}

public class CarTest {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.colour = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);
		
		System.out.println("c1의 colour= " + c1.colour + ", gearType= " + c1.gearType + ", door= " + c1.door);
		System.out.println("c2의 colour= " + c2.colour + ", gearType= " + c2.gearType + ", door= " + c2.door);
	}

}

/* (실행결과:)

c1의 colour= white, gearType= auto, door= 4
c2의 colour= white, gearType= auto, door= 4

*/
