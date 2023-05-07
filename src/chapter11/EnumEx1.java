package chapter11;

enum Direction {EAST, SOUTH, WEST, NORTH}

public class EnumEx1 {

	public static void main(String[] args) {

		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1= " + d1);
		System.out.println("d2= " + d2);
		System.out.println("d3= " + d3);
		
		System.out.println("d1==d2 ? " + (d1==d2));
		System.out.println("d1==d3 ? " + (d1==d3));
		System.out.println("d1.equals(d3) ? " + (d1.equals(d3)));
//		System.out.println("d1 > d3 ? " + (d1 > d3)); //에러
		System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));

		switch(d1) {
    	case EAST: //Direction.EAST라고 쓸수없음!
    		System.out.println("The direction is EAST");
        	break;
        case WEST:
    		System.out.println("The direction is WEST");
        	break;
        case SOUTH:
    		System.out.println("The direction is SOUTH");
        	break;
        case NORTH:
    		System.out.println("The direction is NORTH");
        	break;
        default:
        	System.out.println("Invalid diretion");
        	break;
		}
		
		Direction[] dArr = Direction.values();
		for(Direction d : dArr) // for(Direction d : Direction.values())
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
		//name() : 열거형 상수의 이름을 문자열로 반환
		//ordinal() : 열거형 상수가 저으이된 순서를 0부터 순서를 반환
		
	}

}

/* (실행 결과:)

d1= EAST
d2= WEST
d3= EAST
d1==d2 ? false
d1==d3 ? true
d1.equals(d3) ? true
d1.compareTo(d3) ? 0
d1.compareTo(d2) ? -2
The direction is EAST
EAST=0
SOUTH=1
WEST=2
NORTH=3

*/

