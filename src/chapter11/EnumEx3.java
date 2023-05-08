package chapter11;

enum Transportation {
	BUS(100) { int fare(int distance) { return distance*BASIC_FARE; }},
    TRAIN(15) { int fare(int distance) { return distance*BASIC_FARE; }},
    SHIP(100) { int fare(int distance) { return distance*BASIC_FARE; }},
    AIRPLANE(300) { int fare(int distance) { return distance*BASIC_FARE; }};

	protected final int BASIC_FARE; //protected로 해야 각 상수에서 접근 가능

	Transportation(int basicFare) { //private생략되어있음
		BASIC_FARE = basicFare;
	}
	
	public int getBasicFare() { return BASIC_FARE; }

	//추상메서드:
	abstract int fare(int distance); //거리에 따른 요금 계산
}

public class EnumEx3 {

	public static void main(String[] args) {

		System.out.println("bus fare: " + Transportation.BUS.fare(100));
		System.out.println("train fare: " + Transportation.TRAIN.fare(100));
		System.out.println("ship fare: " + Transportation.SHIP.fare(100));
		System.out.println("airplane fare: " + Transportation.AIRPLANE.fare(100));
	}

}

/* (실행 결과:)

bus fare: 10000
train fare: 1500
ship fare: 10000
airplane fare: 30000

*/

