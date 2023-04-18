package ch6;

class Data1 {
	int value;
// 	기본생성자(default생성자)가 자동으로 추가되어 있음:
//	Data1(){}
}

class Data2 { 
	int value;
	
	Data2(int x) { //매개변수가 있는 생성자
		value = x;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {

		Data1 d1 = new Data1();		
//		Data2 d2 = new Data2(); // compile에러 발생!
		Data2 d2 = new Data2(10); // ok
	}

}
