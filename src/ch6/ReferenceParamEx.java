package ch6;

class Data {
	int x;
}

public class ReferenceParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main(): x= " + d.x);
		
		change(d);
		System.out.println("After change(x),");
		System.out.println("main(): x= " + d.x);
	}
	
	//change메서드의 매개변수를 참조형으로 선언했기 때문에, x의 값이 아닌 주소가 매개변수d에 복사됨
	//이제 main메서드의 참조변수d와 change메서드의 참조변수d는 같은 객체를 가리키게 됨
	//==> 그래서 매개변수 d로 x의 값을 읽는것과 변경하는 것이 모두 가능해짐 (read & write)
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change(): x= " + d.x);
	}
}

/* (실행결과:)

main(): x= 10
change(): x= 1000
After change(x),
main(): x= 1000

 */
