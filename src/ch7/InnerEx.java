package ch7;

class Outer {
	class InstanceInner2 {
		int iv2 = 10;
	}
	
	static class StaticInner2 {
		int iv2 = 20;
		static int cv2 = 30;
	}
	
	void myMethod2() {
		class LocalInner2 {
			int iv2 = 400;
		}
	}
}

public class InnerEx {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner { //인스턴스클래스
		int iv = 100;
		//static int cv = 100;	=> 에러, 인스턴스클래스에 static변수 선언불가능
		final static int CONST = 100; //final static은 상수이므로 가능
		
		int iiv = outerIv; 	//외부클래스의 private멤버도 접근 가능
		int iiv2 = outerCv;	//외부클래스의 static멤버 접근 가능
	}
	
	static class StaticInner { //스태틱클래스
		int iv = 200;
		static int cv = 300; //static클래스만 static멤버 정의가능

		int siv = outerCv;	//스태틱클래스는 외부클래스의 인스턴스멤버에 접근불가능
		static int scv = outerCv;
	}
		
	static void staticMethod() {
		//InstanceInner obj1 = new InstanceInner()	=> 에러, staitc멤버는 인스턴스멤버에 직접 접근불가능
		StaticInner obj2 = new StaticInner();

		//굳이 접근하려면, 아래와 같이 객체를 생성해야함
		//인스턴스클래스는 외부 클래스를 먼저 생성해야만 생성가능:
		InnerEx outer = new InnerEx();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void InstanceMethod() {
		//인스턴스메서드에서는 인스턴스멤버와 static멤버 모두 접근가능:
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//LocalInner lv = new LocalInner();	=> 에러, 메서드 내에 지역적으로 선언된 내부클래스는 외부에서 접근불가능
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner {
			int iv = 400;
			//static int cv = 400;	=> 에러, 지역클래스에 static변수 선언불가능
			final static int CONST = 300; //final static은 상수이므로 가능

			int liv = outerIv;
			int iiv2 = outerIv;
			//int iiv3 = lv;	=> 에러, 외부클래스의 지역변수는 final이 붙은 상수만 접근 가능:
			int iiv4 = LV;
		}
		
		LocalInner lv = new LocalInner();
	}
	
	public static void main(String[] args) {
		System.out.println("InstanceInner.CONST : " + InstanceInner.CONST);
		System.out.println("StaticInner.cv : " + StaticInner.cv);
		System.out.println("--------------------------------------");
		
		//인스턴스클래스의 인스턴스를 생성하려면, 외부클래스의 인스턴스를 먼저생성해야함:
		Outer oc = new Outer();
		Outer.InstanceInner2 ii = oc.new InstanceInner2();
		
		System.out.println("ii.iv2 : " + ii.iv2);
		System.out.println("Outer.StaticInner2.cv2 : " + Outer.StaticInner2.cv2);
		System.out.println("--------------------------------------");

		//스태틱 내부클래스의 인스턴스는 외부클래스를 먼저 생성하지 않아도됨:
		Outer.StaticInner2 si = new Outer.StaticInner2();
		System.out.println("si.iv2 : " + si.iv2);
	}
}

/* (실행결과:)

InstanceInner.CONST : 100
StaticInner.cv : 300
--------------------------------------
ii.iv2 : 10
Outer.StaticInner2.cv2 : 30
--------------------------------------
si.iv2 : 20

*/
