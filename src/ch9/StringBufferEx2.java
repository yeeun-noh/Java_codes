package ch9;
//StringBuffer클래스 예제

public class StringBufferEx2 {

	public static void main(String[] args) throws Exception {

		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2 = sb.append(23);
		sb.append('4').append(56);
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);

		System.out.println("sb : " + sb);  //0123456789.0
		System.out.println("sb2: " + sb2); //0123456789.0
		System.out.println("sb3: " + sb3); //0123456789.0
		System.out.println("---------------------");
		System.out.println(sb.deleteCharAt(10));				//01234567890
		System.out.println(sb.delete(3, 6));					//01267890
		System.out.println(sb.insert(3, "abc"));				//012abc67890
		System.out.println(sb.replace(6, sb.length(), "END"));  //012abcEND
		System.out.println("---------------------");
		System.out.println(sb.capacity());	//18 (버퍼크기)
		System.out.println(sb.length());	//9 ("012abcEND"로 9개)
	}
}

/* (실행결과:)

sb : 0123456789.0
sb2: 0123456789.0
sb3: 0123456789.0
---------------------
01234567890
01267890
012abc67890
012abcEND
---------------------
18
9

*/

