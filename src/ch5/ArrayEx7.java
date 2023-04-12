package ch5;

public class ArrayEx7 {

	public static void main(String[] args) {
		// 섞기(shuffle) : 배열의 요소의 순서를 반복해서 바꾸기(ex. 카드섞기, 로또번호생성)
		// 카드섞기:
		
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i; //배열을 0~9의 숫자로 초기화 (numArr[0]=0, 숫자0부터 시작)
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) { //카드를 100번 섞음
			int n = (int)(Math.random()*10); //0~9중의 한값을 임의로 얻음
			//numArr[0]과 numArr[n]의 값을 변수tmp을 이용해 서로 바꿈:
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]);
		}
	}
	
}

// (실행결과 :)
//
// 0123456789
// 4628073519 (랜덤)
