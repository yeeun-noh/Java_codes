package ch3;

public class OperatorEx04 {

	public static void main(String[] args) {

		int i = -10;
		i = +i;
		System.out.println(i); // -10=> -10
		
		i = -10;
		i = -i;
		System.out.println(i); // -10=> 10
		// 부호연산자'-'는 피연산자의 부호를 반대로 변경한 결과를 반환 (양수->음수, 음수->양수)
		// 부호연산자'+'는 쓰이는경우 거의없음
	}

}
