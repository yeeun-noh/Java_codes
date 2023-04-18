package ch7;

class Tv {
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class CaptionTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if(caption) // 캡션상태가 on(true)일때만 text를 보여줌
			System.out.println(text);
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {

		CaptionTv ctv = new CaptionTv(); //ctv는 CationTv클래스와 Tv클래스 모두 접근 가능
		ctv.channel = 10;
		ctv.channelUp(); // ++channel을 통해 channel은 11로 증가
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, World"); // caption은 아직 off(false)이므로 문장 출력 안됨
		ctv.caption = true;  
		ctv.displayCaption("Hello, World!!!!!"); //위의 문장에서 caption을 on(true)했기 때문에 문장이 출력됨
	}

}

/* (실행결과:)

11
Hello, World!!!!!

 */
