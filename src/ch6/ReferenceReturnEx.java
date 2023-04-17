package ch6;

class Data{ int x; }

public class ReferenceReturnEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		Data d2 = copy(d);
		System.out.println("d.x= " + d.x);
		System.out.println("d2.x= " + d2.x);
	}
	
	static Data copy(Data d) {
		Data tmp = new Data(); //새로운 객체 tmp를 생성
		tmp.x = d.x; //d.x의 값을 tmp.x에 복사
		
		return tmp; //복사한 객체의 주소를 반환
	}

}

/* (실행결과:)

d.x= 10
d2.x= 10

*/
