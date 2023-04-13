package ch5;

public class ArrayExx16 {

	public static void main(String[] args) {
		// 커맨드 라인을 통해 입력받기:
		// arguments에 abc 123 "Hello" 넣었을 때: 
		
		System.out.println("매개변수의 개수: " + args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
		}
	}

}

/* (실행결과:)

매개변수의 개수: 3
args[0] = "abc"
args[1] = "123"
args[2] = "Hello"

*/
