package chapter14;

@FunctionalInterface
interface MyFunctionn {
	void myMethod();
}

class Outer {
	int val = 0;
	
	class Inner { //내부클래스
		int val = 20; //this.val

		void method(int i) { // == void method(final int i) {
			int val = 30;	// == final int val = 0;
		//	i = 10;			//에러, 상수(final)의 값을 변경할수 없음!

			MyFunctionn f = () -> {
				System.out.println("             i: " + i);
				System.out.println("           val: " + val);
				System.out.println("      this.val: " + this.val);
				System.out.println("Outer.this.val: " + Outer.this.val);
			};

			f.myMethod();
		}
	}
}

public class LambdaEx3 {
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100);
	}
  
}

/* (실행결과:)

             i: 100
           val: 30
      this.val: 20
Outer.this.val: 0

*/
