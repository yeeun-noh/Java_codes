package ch6;

class Data{ int x; }

public class ReferenceReturnEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		Data d2 = copy(d); //d = 인자값
		System.out.println("d.x= " + d.x);
		System.out.println("d2.x= " + d2.x);
	}
	
	// copy메서드는 새로운 객체를 생성한 다음에, 매개변수로 넘겨받은 객체에 저장한 값을 복사해서 반환함
	// 반환하는 값이 Data객체의 주소이므로, 반환타입이 'Data'인 것!
	// 이 메서드의 반환타입이 'Data'이므로, 호출결과를 저장하는 변수의 타입 역시 'Data'타입의 참조변수이어야 함
	static Data copy(Data d) { //d = 매개변수 (인자와 매개변수의 타입은 같아야함)
		Data tmp = new Data(); //새로운 객체 tmp를 생성
		tmp.x = d.x; //d.x의 값을 tmp.x에 복사
		
		return tmp; //복사한 객체의 주소를 반환
	}

}

/* (실행결과:)

d.x= 10
d2.x= 10

*/
