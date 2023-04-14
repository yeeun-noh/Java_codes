package ch6;

class Tv {
	//Tv의 속성(멤버변수):
	String  colour;		//색상
	boolean power;		//전원상태(on/off)
	int channel;		//채널
	
	//Tv의 기능(메서드):
	void power() { power = !power; }	//채널을 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++channel; }		//채널을 높이는 기능을 하는 메서드
	void channelDown() { --channel; }	//채널을 낮추는 기능을 하는 메서드
}

class TvTest3 {
	public static void main(String[] args) {
		Tv t1 = new Tv(); 
 		Tv t2 = new Tv();
 		System.out.println("t1.channel의 값은 " + t1.channel);
 		System.out.println("t2.channel의 값은 " + t2.channel);

 		t2 = t1; //t1이 저장하고 있는 값(주소)을 t2에 저장
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경 ");
		
		//이제 t1, t2 모두 같은 Tv클래스의 인스턴스를 가리키고 있기 때문에 t1.channel과 t2.channel의 값은 7
		System.out.println("t1.channel의 값은 " + t1.channel);
		System.out.println("t2.channel의 값은 " + t2.channel);
	}
}

/* (실행결과:)

t1.channel의 값은 0
t2.channel의 값은 0
t1의 channel값을 7로 변경 
t1.channel의 값은 7
t2.channel의 값은 7

 */
