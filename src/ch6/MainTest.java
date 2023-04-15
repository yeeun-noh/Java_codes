package ch6;

public class MainTest {
	
	public static void main(String[] args) {
		main(null); //재귀호출, 자기자신을 다시 호출
	}
	// 무한호출에 빠짐! (StackOverflowError 발생)
}
