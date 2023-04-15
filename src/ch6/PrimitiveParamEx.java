package ch6;

class Data {
	int x;
}

public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main(): x= " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x),");
		System.out.println("main(): x= " + d.x);
		//'d.x'의 값이 변경된 것이 아니라, change메서드의 매개변수 x의 값이 변경된 것!
		// ==> 기본형 매개변수는 변수의 저장된 값만 읽을 수만 있을뿐 변경 불가능(read only)
	
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change(): x= " + x);
	}
}

/* (실행결과:)

main(): x= 10
change(): x= 1000
After change(d.x),
main(): x= 10

 */
