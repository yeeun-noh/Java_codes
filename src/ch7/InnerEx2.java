package ch7;

class OuterClass {
	int value = 10;		//OuterClass.this.value

	class InnerClass {
		int value = 20;	//this.value
		
		void method() {
			int value = 30;
			System.out.println("               value : " + value);
			System.out.println("          this.value : " + this.value);
			System.out.println("OuterClass.this.value: " + OuterClass.this.value);
		}
	}
}

public class InnerEx2 {
	
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.method();
	}
}

/* (실행결과:)

               value : 30
          this.value : 20
OuterClass.this.value: 10

*/
