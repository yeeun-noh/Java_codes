package ch5;

public class ArrayExx11 {

	public static void main(String[] args) {
		// 빈도수 구하기 : 배열에 어떤 값이 몇개 저장되어 있는지 세어서 보여주기
		
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = (int)(Math.random()*10); // 0~9의 임의의 수를 배열에 저장
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<numArr.length; i++) {
			counter[numArr[i]]++; // 배열의 i가 몇개 저장되어 있는지 ++를 통해 알려줌
		}

		for(int i=0; i<numArr.length; i++) {
			System.out.println(i + "의 개수 :" + counter[i]);
		}
	}
	
}

// (실행결과 :)
//
// 1230491051 (랜덤)
// 0의 개수 :2
// 1의 개수 :3
// 2의 개수 :1
// 3의 개수 :1
// 4의 개수 :1
// 5의 개수 :1
// 6의 개수 :0
// 7의 개수 :0
// 8의 개수 :0
// 9의 개수 :1
