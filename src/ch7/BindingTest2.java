package ch7;

public class BindingTest2 {

	public static void main(String[] args) {
		Parent_class p = new Child_class();
		Child_class c = new Child_class();
		
		System.out.println("p.x= " + p.x);
		p.method();
		
		System.out.println("c.x= " + c.x);
		c.method();
	}

}

class Parent_class {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child_class extends Parent_class {}

/* (실행결과:)

p.x= 100
Parent Method
c.x= 100
Parent Method

*/
