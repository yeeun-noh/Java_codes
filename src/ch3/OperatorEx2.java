package ch3;

public class OperatorEx2 {

	public static void main(String[] args) {

		int i = 5, j = 0;
		
		j = i++; // j=5, i=6 (i를 먼저 j에 대입=> j=5 => 그리고 나서 i++ 실행 i +1 => i=6)
		System.out.println("j= i++; 실행후, i= " + i + ", j= " + j);
		
		//다시 값을 int i = 5, j = 0 로 변경 :
		i = 5;
		j = 0;
		
		j = ++i; // i=6, j=6 (오른쪽항부터 실행. i를 먼저 +1 => i=6 => i를 j에 대입 => j=6)
		System.out.println("j= i++; 실행후, i= " + i + ", j= " + j);
	}

}
