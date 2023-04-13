package ch5;

public class ArrayExx17 {

	public static void main(String[] args) {
		// 커맨드 라인을 통해 입력받기:
		
		if(args.length !=3) {
			System.out.println("usage: java ArrayEx17 NUM OP NUM2");
			System.exit(0); // 프로그램 종료
		}
		
		int num1 = Integer.parseInt(args[0]); // 문자열을 숫자로 변환
		char op = args[1].charAt(0); // 문자열을 문자(char)로 변환
		int num2 = Integer.parseInt(args[2]);
		int result = 0;
		
		switch(op) {
			case'+' :
				result = num1 + num2;
				break;
			case'-' :
				result = num1 - num2;
				break;
			case'x' :
				result = num1 * num2;
				break;
			case'/' :
				result = num1 / num2;
				break;
			default :
				System.out.println("지원하지 않는 연산!");
		}
		System.out.println("결과: " + result);
		
	}

}

// arguments에 아무것도 안치면 (실행결과)==> usage: java ArrayEx17 NUM OP NUM2
// 10 + 3 치면 (실행결과)==> 결과: 13
// 10 x 3 치면 (실행결과)==> 결과: 30
