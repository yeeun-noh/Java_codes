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

class TvTest {
	public static void main(String[] args) {
		Tv t;				//Tv인스턴스를 참조하기 위한 참수변수t를 선언
		t = new Tv();			//Tv인스턴스를 생성
// 		Tv  t = new Tv();축약가능
		
		t.channel = 7;			//Tv인스턴스의 멤버변수 channel의 값을 7로 함
		t.channelDown();		//Tv인스턴스 메서드 channelDown()을 호출
		System.out.println("현재채널은 " + t.channel);
	}
}

/* (실행결과:)

현재채널은 6

 */
