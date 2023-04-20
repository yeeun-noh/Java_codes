package ch7;

public class BindingTest {

	public static void main(String[] args) {
		ParentClass p = new ChildClass();
		ChildClass c = new ChildClass();
		
		System.out.println("p.x= " + p.x);
		p.method();
		
		System.out.println("c.x= " + c.x);
		c.method();
	}

}

class ParentClass {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class ChildClass extends ParentClass {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}

/* (실행결과:)

p.x= 100
Child Method
c.x= 200
Child Method

*/
