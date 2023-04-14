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

class TvTest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv(); 
 		Tv t2 = new Tv();
		System.out.println("t1.channel의 값은 " + t1.channel);
		System.out.println("t2.channel의 값은 " + t2.channel);
		// 같은 클래스로부터 생성 되었을지라도 각 인스턴스의 속성(멤버변수)은 서로 다른 값을 유지할수 있고,
		// 메서드의 내용은 모든 인스턴스에 대해 동일함

		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경 ");

		System.out.println("t1.channel의 값은 " + t1.channel);
		System.out.println("t2.channel의 값은 " + t2.channel);
	}
}

/* (실행결과:)

t1.channel의 값은 0
t2.channel의 값은 0
t1의 channel값을 7로 변경 
t1.channel의 값은 7
t2.channel의 값은 0

 */
