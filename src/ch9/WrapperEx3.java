package ch9;
//wrapper클래스 - 오토박싱 & 언박싱
//이 예시는 오토박싱:

public class WrapperEx3 {

	public static void main(String[] args) {

		int i = 10;
		
		//기본형을 참조형으로 형변환(형변환 생략가능):
		Integer intg = (Integer)i;
	//	Integer intg = Integer.valueOf(i); 와 같음
		
		Object obj = (Object)i;
	//	Object obj = (Object)Integer.valueOf(i); 와 같음
		
		Long lng = 100L;
	//	Long lng = new Long(100L); 와 같음
	
		int i2 = intg + 10;  //참조형과 기본형간의 연산가능!
		long l = intg + lng; //참조형간의 덧셈도 가능!
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2; //참조형을 기본형으로 형변환도 가능!(형변환 생략가능)
		
		Integer intg3 = intg2 + i3;
		
		System.out.println(i);		//10
		System.out.println(intg);	//10
		System.out.println(obj);	//10
		System.out.println(lng);	//100
		System.out.println(i2);		//20
		System.out.println(l);		//110
		System.out.println(intg2);	//20
		System.out.println(i3);		//20
		System.out.println(intg3);	//40
		
	}

}

/* (실행결과:)

10
10
10
100
20
110
20
20
40

*/


