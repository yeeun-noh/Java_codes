package ch8;
//finally블럭

public class FinallyTest {

	public static void main(String[] args) {
		//method1은 staic메서드이므로, 인스턴스생성없이 직접호출 가능:
		FinallyTest.method1();
		System.out.println("method1()의 수행을 마치고 main메서드로 돌아옴");
	}
	
	static void method1() {
		try {
			System.out.println("method1()이 호출됨");
			return; //현재 실행중인 메서드를 종료함
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1()의 finally블럭이 실행됨");
		}
	}
}

/* (실행결과:)

method1()이 호출됨
method1()의 finally블럭이 실행됨
method1()의 수행을 마치고 main메서드로 돌아옴

*/
