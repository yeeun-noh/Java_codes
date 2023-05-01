package ch9;
//equals(Object obj)

public class EqualsEx2 {

	public static void main(String[] args) {

		Person p1 = new Person(80118011222L);
		Person p2 = new Person(80118011222L);
		
		if(p1 == p2)
			System.out.println("p1과 p2는 같음");
		else
			System.out.println("p1과 p2는 다름");

		if(p1.equals(p2))
			System.out.println("p1과 p2는 같음");
		else
			System.out.println("p1과 p2는 다름");
	}

}

class Person {
	long id;
	
	public boolean equals(Object obj) {
		if(id == ((Person)obj).id)
			return true;
		else
			return false;
	}
	
	Person(long id) {
		this.id = id;
	}
}


/* (실행결과:)

v1과 v2는 다름
v1과 v2는 같음

*/
