package ch5;

public class ArrayEx8 {

	public static void main(String[] args) {
		// 섞기(shuffle) : 배열의 요소의 순서를 반복해서 바꾸기(ex. 카드섞기, 로또번호생성)
		// 로또번호생성:
		
		int[] ball = new int[45]; // 45개의 정수값을 저장하기 위한 배열 생성
		
		// 배열의 각 요소에 1~45의 값을 저장 
		for(int i=0; i<ball.length; i++) {
			ball[i] = i + 1; // ball[0]=1 (1부터 시작하기 때문에)
		}
		
		int tmp = 0; //두 값을 바꾸는데 사용할 임시변수
		int j = 0; // 임의의 값을 얻어서 저장할 변수
		
		// 배열의 i번째 요소와 임이의 요소에 저장된 값을 서로 바꿔서 섞어줌
		// 0번째 부터 5번째 요소까지 모두 6개만 바꾸기
		for(int i=0; i<6; i++) {
			j = (int)(Math.random()*45); // 0~9중의 한값을 임의로 얻음
			//ball[i]와 ball[j]의 값을 변수tmp을 이용해 서로 바꿈:
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		// 배열ball의 앞에서부터 6개의 요소를 출력(ball[0]~ball[6])
		for(int i=0; i<6; i++) {
			System.out.println("ball[" + i + "] =" + ball[i]);
		}
	}
	
}

// (실행결과 :)
//
// ball[0] =7
// ball[1] =5
// ball[2] =39
// ball[3] =18
// ball[4] =14
// ball[5] =2 (로또 값들은 다 랜덤)
