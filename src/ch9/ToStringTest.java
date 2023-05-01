package ch9;
//toString()
//java.util.Date

public class ToStringTest {

	public static void main(String[] args) {
		
		//String클래스의 toString()은 String인스턴스가 갖고있는 문자열을 반환하도록 오버라이딩 되어 있음 :
		String str = new String("KOREA");
		
		//Date클래스의 경우, Date인스턴스가 갖고있는 날짜와 시간을 문자열로 변환하여 반환하도록 오버라이딩 되어있음 :
		java.util.Date today = new java.util.Date(); 
		
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(today);
		System.out.println(today.toString());
	}
	
}

/* (실행결과:)

KOREA
KOREA
Mon May 01 18:28:32 KST 2023
Mon May 01 18:28:32 KST 2023

*/

