package ch9;
//equals(Object obj)

public class EqualsEx1 {

	public static void main(String[] args) {

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같음");
		else
			System.out.println("v1과 v2는 다름");
		
		v2 = v1;
		if(v1.equals(v2))
				System.out.println("v1과 v2는 같음");
		else
			System.out.println("v1과 v2는 다름");
	}

}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
}


/* (실행결과:)

v1과 v2는 다름
v1과 v2는 같음

*/
