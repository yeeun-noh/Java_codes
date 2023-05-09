package chapter14;

@FunctionalInterface
interface MyFunction {
	void run(); // == public abstract void run(); (추상메서드)
}

public class LambdaEx1 {
	static void execute(MyFunction f) { //매개변수의 타입이 MyFunction인 메서드
		f.run();
	}
	
	static MyFunction getMyFunction() { //반환타입이 MyFunction인 메서드
		MyFunction f = ()-> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {
		
		//람다식으로 MyFunction의 run()을 구현:
		MyFunction f1 = () -> System.out.println("f1.run()");

		//익명클래스로 run()을 구현:
		MyFunction f2 = new MyFunction() {
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
		//반환타입이 MyFunction인 메서드를 호출해서 run()을 구현:
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute( () -> System.out.println("run()"));
	}
}

/* (실행결과:)

f1.run()
f2.run()
f3.run()
f1.run()
run()

*/
