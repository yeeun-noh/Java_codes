package ch5;

public class ArrayEx4 {

	public static void main(String[] args) {
		
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc); //ABCD (char배열만 println메서드로 출력하면 각 요소가 구분자없이 그대로 출력됨)
		System.out.println(num); //0123456789
		
		//배열abc와 배열num을 붙여서 하나의 배열(result)로 만들기:
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length); // abc[0]에서 result[0]으로 abc.length개의 데이터를 복사
		System.arraycopy(num, 0, result, abc.length, num.length); // num[0]에서 result[abc.length]으로 num.length개의 데이터를 복사
		System.out.println(result); //ABCD0123456789
		
		//배열abc를 배열num의 첫번째 위치부터 배열abc의 길이만큼 복사:
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num); //ABCD456789
		
		//num의 인덱스6 위치에 3개를 복사:
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num); //ABCD45ABC9
	}

}

// (실행결과:)
//
// ABCD
// 0123456789
// ABCD0123456789
// ABCD456789
// ABCD45ABC9
