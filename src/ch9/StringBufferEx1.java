package ch9;
//StringBuffer클래스

public class StringBufferEx1 {

	public static void main(String[] args) throws Exception {

		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println(sb == sb2);		//false
		System.out.println(sb.equals(sb2));	//false
		
		//StringBuffer의 내용을 String으로 변환:
		String s = sb.toString(); // String s = new String(sb)와 같음!
		String s2 = new String(sb2);
		System.out.println(s==s2);			//false
		System.out.println(s.equals(s2));	//true
	}
}

/* (실행결과:)

false
false
false
true

*/

