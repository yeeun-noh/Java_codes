package ch6;
//보여주는 용:

class MemberCall {	
	int iv = 10; 		// iv는 인스턴스변수
	static int cv = 20; // cv는 클래스변수
	
	int iv2 = cv;
//	static int cv2 = iv;					//에러! 클래스변수는 인스턴스변수 사용불가능
	static int cv2 = new MemberCall().iv;	//이처럼 객체를 사용해야 사용가능

	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);		//에러! 클래스메서드에서 인스턴스변수를 사용불가능
		MemberCall c = new MemberCall();
		System.out.println(c.iv);	// 이처럼 객체를 생성한 후에야 인스턴스변수의 참조가능
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);	//인스턴스메서드에서는 인스턴스변수 바로 사용가능
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();		//에러! 클래스 메서드에서는 인스턴스 메서드 호출불가능
		MemberCall c = new MemberCall();
		c.instanceMethod1();	//이처럼 인스턴스를 생성한 후에야 호출 가능
	}
	
	void instanceMethod2() {
		//인스턴스메서드에서는 인스턴스메서드와 클래스메서드 모두 인스턴스 생성없이 바로 호출 가능
		staticMethod1();
		instanceMethod1();
	}	
}
