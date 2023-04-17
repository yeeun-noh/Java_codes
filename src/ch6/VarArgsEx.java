package ch6;
// 가변인자 (variable arguments)
// "타입... 변수명" 형식으로 선언
public class VarArgsEx {

	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[] {"1", "2", "3"}));
		System.out.println("[" + concatenate(",", new String[0]) + "]");
		System.out.println("[" + concatenate(",") + "]");
	}

	// 여러 문자열을 하나로 결합하여 반환하는 concatenate메서드:
	static String concatenate(String delim, String...args) {
		String result = "";
		
		for(String str : args)
			result += str + delim;
		
		return result;
	}
}

/* (실행결과:)

100200300
100-200-300-
1,2,3,
[]
[]

*/
