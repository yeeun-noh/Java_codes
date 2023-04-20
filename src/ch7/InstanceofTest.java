package ch7;

class Cars extends Object {}

class FireEngines extends Cars {}

public class InstanceofTest {

	public static void main(String[] args) {

		FireEngines fe = new FireEngines();
		
		if(fe instanceof FireEngines)
			System.out.println("This is a FireEngines instance.");
    if(fe instanceof Cars)
			System.out.println("This is a Cars instance.");
		if(fe instanceof Object)
			System.out.println("This is a Object instance.");
//		FireEngines클래스는 Object클래스와 Cars클래스의 자손클래스이므로 조상의 멤버들을 상속받았기 때문에,
//		FireEngines인스턴스는 Object인스턴스와 Cars인스턴스를 포함하고 있는 셈임! 
//		-> 실제 인스턴스와 같은 타입의 instanceof 연산 이외에 부모타입의 instanceof 연산에도 true를 결과로 얻음
    
    
		System.out.println(fe.getClass().getName()); //클래스의 이름을 출력
		//'참조변수.getClass().getName()' 은 참조변수가 가리키고 있는 인스턴스의 클래스이름으 문자열로 반환함!
	}

}

/* (실행결과:)

This is a FireEngines instance.
This is a Cars instance.
This is a Object instance.
ch7.FireEngines

*/
