package ch4;

public class FlowExx31 {

	public static void main(String[] args) {

		for(int i=0; i<=10; i++) {
			if(i%3==0)
				continue; // break문과 달리 반복문을 벗어나지 않음
			System.out.print(i + ", ");
		}
	}

}

// (실행결과 :)
//
// 1, 2, 4, 5, 7, 8, 10,
