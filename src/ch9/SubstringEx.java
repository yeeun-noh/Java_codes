package ch9;
//String 클래스 - subString메서드를 이용하여 한 문자열에서 내용의 일부를 추출하는 예
//substring(int start, int end)

public class SubstringEx {

	public static void main(String[] args) throws Exception {
		
		String fullName = "Hello.java";
		
		//fullName에서 '.'의 위치를 찾음:
		int index = fullName.indexOf('.');
		
		//fullName의 첫글자부터 '.'이 있는 곳 전까지 문자열을 추출함('.'포함 안됨):
		String fileName = fullName.substring(0, index);
		
		//'.'의 다음 문자부터 시작해서 문자열의 끝까지 추출함('.'포함 안됨):
	//	String ext = fullName.substring(index+1, fullName.length()); 와 같음
		String ext = fullName.substring(index+1);
		
		System.out.println(index);		//5
		System.out.println(fileName);	//Hello	
		System.out.println(ext);		//java
	}
	
}

/* (실행결과:)

5
Hello
java

*/
