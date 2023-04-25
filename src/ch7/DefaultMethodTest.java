package ch7;

public class DefaultMethodTest {

	public static void main(String[] args) {

		MyChild c = new MyChild();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();		
	}

}

class MyChild extends MyParent implements MyInterface, MyInterface2 {
	public void method1() {
		System.out.println("method1() in Child class"); //오버라이딩
	}
}

class MyParent {
	public void method2() {
		System.out.println("method2() in Parent class"); //오버라이딩
	}
}

interface MyInterface {
	default void method1() {
		System.out.println("method1() in MyInterface class");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface class");
	}

	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface class");
	}
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2 class");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2 class");
	}
}

/* (실행결과:)

method1() in Child class
method2() in Parent class
staticMethod() in MyInterface class
staticMethod() in MyInterface2 class

*/

