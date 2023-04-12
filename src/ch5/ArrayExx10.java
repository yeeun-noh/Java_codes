package ch5;

public class ArrayExx10 {

	public static void main(String[] args) {
		// 정렬하기(sort) : 오름차순, 내림차순으로 배열을 정렬하기
		
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10)); // 0~9의 임의의 수를 배열에 저장한것을 출력
//			위의 문장은 아래의 두문장을 하나로 합친것임!
//			numArr[i] = (int)(Math.random()*10);
//			System.out.print(numArr[i]);
		}
		System.out.println();
		
		// 배열의 길이가 n일 때, 배열의 첫 번째부터가 n-1까지의 요소에 대해, 근접한 값과 크기를 비교하여 자리바꿈을 계속함:\
		// 즉, 배열의 길이가 5(n)라면, 4(n-1)번만 비교하면 됨
		for(int i=0; i<numArr.length-1; i++) {
			boolean changed = false; // 자리 바꿈이 발생했는지를 체크
			
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j]> numArr[j+1]) { // 옆의 값이 작으면 서로 바꿈:
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					changed = true; // 자리 바꿈이 발생했으니 changed를 true로
				}
			}
			
			if(!changed) break; // 자리 바꿈이 없으면 반복문 벗어남
			
			for(int k=0; k<numArr.length; k++) {
				System.out.print(numArr[k]); // 정렬된 결과를 출력
			}
			System.out.println();
		}
	}
	
}

// (실행결과 :)
//
// 8476937878
// 4768378789
// 4673787889
// 4637778889
// 4367778889
// 3467778889
