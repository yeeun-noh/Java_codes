package ch7;

public class InnerEx2 {

	class InstanceInner {}
	static class StaticInner {}
	
	InstanceInner iv = new InstanceInner();			//인스턴스멤버 간에는 서로 직접가능
	static StaticInner sv = new StaticInner();		//staitc멤버 간에는 서로 직접가능
	
	static void staticMethod() {
		//staitc멤버는 인스턴스멤버에 직접 접근불가능:
//		InstanceInner obj1 = new InstanceInner()
		StaticInner obj2 = new StaticInner();

		//굳이 접근하려면, 아래와 같이 객체를 생성해야함:
		//인스턴스클래스는 외부 클래스를 먼저 생성해야만 생성가능:
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void InstanceMethod() {
		//인스턴스메서드에서는 인스턴스멤버와 static멤버 모두 접근가능:
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//메서드 내에 지역적으로 선언된 내부클래스는 외부에서 접근가능:
//		LocalInner iv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner iv = new LocalInner();
	}
}
