package ch9;
//wrapper클래스

public class WrapperEx1 {

	public static void main(String[] args) {

		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i == i2);		 //false
		System.out.println(i.equals(i2));	 //true
		System.out.println(i.compareTo(i2)); //0
		System.out.println(i.toString()); 	 //100
		System.out.println(i2.toString()); 	 //100
		
		System.out.println(Integer.MAX_VALUE);	//2147483647
		System.out.println(Integer.MIN_VALUE);	//-2147483648
		System.out.println(Integer.SIZE);		//32
		System.out.println(Integer.BYTES);		//4
		System.out.println(Integer.TYPE);		//int
	}

}

/* (실행결과:)

false
false
false
true

*/


