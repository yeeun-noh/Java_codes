package ch7;

public class InnerEx1 {

	class InstanceInner {
		int iv = 100;
//	static int cv = 100;				//=>에러, 인스턴스클래스에 static변수 선언불가능
		final static int CONST = 100;	//final static은 상수이므로 가능
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;			//static클래스만 static멤버 정의가능
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300;			//=>에러, 지역클래스에 static변수 선언불가능
			final static int CONST = 300;	//final static은 상수이므로 가능
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}

/* (실행결과:)

100
200

*/
