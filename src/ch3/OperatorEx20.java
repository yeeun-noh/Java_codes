package ch3;

public class OperatorEx20 {

	public static void main(String[] args) {

		System.out.println(-10%8); //-2
		System.out.println(10%-8); //2
		System.out.println(-10%-8); //-2
		// 나머지 연산자(%)는 나누는 수로 음수도 허용
		// 그러나 부호는 무시되므로 결과는 음수의 절댓값으로 나눈 나머지와 결과가 같음
		//-> 피연사자의 부호를 모두 무시하고, 나머지 연산을 한 결과에 왼쪽 피연산자의 부호(=나눠지는 수)를 붙이면 됨
	}

}
