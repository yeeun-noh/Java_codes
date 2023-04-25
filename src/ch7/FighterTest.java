package exercise;

public class FighterTest {

	public static void main(String[] args) {

		Fighter f = new Fighter();
		
		if(f instanceof Unit)
			System.out.println("f는 Unit클래스의 자손임");
		if(f instanceof Fightable)
			System.out.println("f는 Fightable인터페이스를 구현함");
		if(f instanceof Movable)
			System.out.println("f는 Movable인터페이스를 구현함");
		if(f instanceof Attackable)
			System.out.println("f는 Attackable인터페이스를 구현함");
		if(f instanceof Object)
			System.out.println("f는 Object클래스의 자손임");
	}

}

//상속은 extends, 구현은 implements 사용:
class Fighter extends Unit implements Fightable { //상속 + 구현 동시에 가능
	//오버라이딩할 때는 조상의메서드보다 넓은 범위의 접근제어자를 지정해야함
	//인터페이스 메서드는 "public abstract"을 반드시 사용함(생략 가능)
	//따라서 구현하는 클래스의 메서드의 접근제어자는 반드시 public으로 해야함:
	public void method(int x, int y)	{/*내용생략*/}
	public void attack(Unit u)			{/*내용생략*/}
}

class Unit {
	int currentHP;
	int x;
	int y;
}

//인터페이스로부터 다중상속 가능:
interface Fightable extends Movable, Attackable {}

interface Movable {
	public abstract void method(int x, int y);	//public abstract 생략가능
}

interface Attackable {
	public abstract void attack(Unit u); 		//public abstract 생략가능
}

/* (실행결과:)

f는 Unit클래스의 자손임
f는 Fightable인터페이스를 구현함
f는 Movable인터페이스를 구현함
f는 Attackable인터페이스를 구현함
f는 Object클래스의 자손임

*/
