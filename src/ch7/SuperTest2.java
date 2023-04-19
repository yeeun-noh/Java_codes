package ch7;

public class SuperTest2 {

	public static void main(String[] args) {

		Childs c = new Childs();
		c.method();
	}
}

class Parents {
	int x =10;
}

class Childs extends Parents{
	int x = 20;
	void method() {
		System.out.println("x= " + x); 
		System.out.println("this.x= " + this.x);    //this.x는 하위클래스에 선언된 멤버변수를 뜻하고,
		System.out.println("super.x= " + super.x);  //super.x는 상위클래스로부터 상속받은 멤버변수를 뜻함!
	}
}

/* (실행결과:)
x= 20
this.x= 20
super.x= 10
*/
