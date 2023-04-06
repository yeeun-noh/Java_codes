package ch3;

public class Operator12 {

	public static void main(String[] args) {
		
    char c1 = 'a'; // c1에는 문자 'a'의 코드값인 97이 저장
		char c2 = c1; // c1에 저장되어 있는 값이 c2에 저장
		char c3 = ' '; // c3를 공백으로 초기화 
		
		int i = c1 + 1; // 'a'+1 => 97+1 => 98('b')
		
		c3 = (char)(c1+1);
		//덧셈연산 c1+1의 결과가 int이므로,
		//이결과를 char형 변수 c3에 담기 위해서는 char형으로의 형변환 필요
		c2++; //'a'->'b'
		c2++; //'b'->'c'
		
		System.out.println("i= " + i);
		System.out.println("c2= " + c2);
		System.out.println("c3= " + c3);		
	}
}
