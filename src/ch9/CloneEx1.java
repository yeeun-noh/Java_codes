package ch9;
//clone() + "공변 반환타입" 사용

public class CloneEx1 {

	public static void main(String[] args) {
		
		Point original = new Point(3,5);
		Point copy = (Point)original.clone(); //복제(clone)해서 새로운 객체 생성
		System.out.println(original);
		System.out.println(copy);
		System.out.println(original.equals(copy)); //false, 참조값은 다름
	}

}

class Point implements Cloneable {	//(1)Cloneable 인터페이스 구현
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x: " + x + ", y: " + y;
	}
	
//	public Object clone() {			//(2)접근제어자를 protected에서 public으로 변경
//		Object obj = null;
//		try {
//			obj = super.clone();	//(3)try-catch내에서 조상클래스의 clone()을 호출
//		} catch(CloneNotSupportedException e) {}
//		return obj;
//	}
	
	//위의 코드를 "공변 반환타입" 사용:
	public Point clone() {			//(1)반환타입을 Object에서 Point로 변경
		Object obj = null;
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) {}
		return (Point)obj;			//(2)Point타입으로 형변환함   
	}
}

/* (실행결과:)

x: 3, y: 5
x: 3, y: 5
false

*/

