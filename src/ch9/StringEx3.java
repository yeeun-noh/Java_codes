package ch9;
//String 클래스 - 빈 문자열

public class StringEx3 {

	public static void main(String[] args) throws Exception {
		//길이가 0인 char배열을 생성함:
		 char[] cArr = new char[0];
	  // char[] cArr = {}; 와 같음
		 
		 String s = new String(cArr);
	  // String s = new String(""); 와 같음
		 
		 System.out.println("cArr.length= " + cArr.length);
		 System.out.println("@@@" + s + "@@@");
	}
	
}

/* (실행결과:)

cArr.length= 0
@@@@@@

*/

