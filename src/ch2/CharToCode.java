package ch2;

public class CharToCode {

	public static void main(String[] args) {
	
		char ch = 'A'; // 65
		int code = (int)ch; // ch에 저장된 값을 int타입으로 변환하여 저장
		
		System.out.printf("%c = %d (%#X)%n", ch, code, code);
		
		char hch = '가'; // 0xAC00;
		System.out.printf("%c = %d (%#X)%n", hch, (int)hch, (int)hch);
	}

}
