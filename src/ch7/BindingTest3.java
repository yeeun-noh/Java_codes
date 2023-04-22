package ch7;

class Parentt {			//상위클래스
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Childd extends Parentt {	//하위클래스
	int x = 200;		//상위클래스의 멤버변수와 이름 같음

	void method() {		//오버라이딩
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);	//같은클래스의 x(200) 호출/사용
		System.out.println("super.x= " + super.x);	//상위클래스의 x(100) 호출/사용
	}
}

public class BindingTest3 {

	public static void main(String[] args) {
		Parentt p = new Childd(); //상위클래스는 하위클래스 참조가능 (하위클래스 함수사용은 불가능하지만 오버라이딩 하면 가능해짐, 하위클래스의 오버라이딩 함수 먼저 사용)
		Childd c = new Childd();
		
		//멤버변수는 참조변수 타입과 일치:
		System.out.println("p.x= " + p.x);
		System.out.println("c.x= " + c.x);

		System.out.println();
		
		//메서드는 실제 인스턴스의 타입과 일치:
		p.method();
		System.out.println();
		c.method();
	}

}

/* (실행결과:)

p.x= 100
c.x= 200

x= 200
this.x= 200
super.x= 100

x= 200
this.x= 200
super.x= 100

*/
