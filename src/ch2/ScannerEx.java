package ch2;

// import java.util.*; 
import java.util.Scanner; // Scanner를 사용하기 위해 추가

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("두자리 정수를 하나 입력해주세요 : ");
		String input = sc.nextLine(); // 입력받은 내용을 input에 저장 
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		
		System.out.println("입력내용 : " + input);
		System.out.printf("num= %d%n", num);
	}

}
