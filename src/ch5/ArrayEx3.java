package ch5;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		//배열arr에 1~5 저장
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1; //== index0에 숫자1부터시작
		}
		
		System.out.println("<변경전>");
		System.out.println("arr.length: " + arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		int[] tmp = new int[arr.length*2]; // 기존arr배열보다 길이가 2배인 배열tmp 생성
		
		//배열arr에 저장된값을 배열tmp에 복사
		for(int i=0; i<arr.length; i++) {
			tmp[i] = arr[i]; // arr[i]의 값을 tmp[i]에 저장
		}
		arr = tmp; // 변수tmp에 저장된 값을 변수arr에 저장
		
		System.out.println("<변경후>");
		System.out.println("arr.length: " + arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}

}
// (실행결과:)
//
// <변경전>
// arr.length: 5
// arr[0] : 1
// arr[1] : 2
// arr[2] : 3
// arr[3] : 4
// arr[4] : 5
// <변경후>
// arr.length: 10
// arr[0] : 1
// arr[1] : 2
// arr[2] : 3
// arr[3] : 4
// arr[4] : 5
// arr[5] : 0
// arr[6] : 0
// arr[7] : 0
// arr[8] : 0
// arr[9] : 0
