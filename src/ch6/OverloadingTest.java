package ch6;

public class OverloadingTest {

	public static void main(String[] args) {
		Mymath3 m = new Mymath3();
		System.out.println("m.add(3, 3) 결과: " + m.add(3, 3));
		System.out.println("m.add(3L, 3) 결과: " + m.add(3L, 3));
		System.out.println("m.add(3, 3L) 결과: " + m.add(3, 3L));
		System.out.println("m.add(3L, 3L) 결과: " + m.add(3L, 3L));
		
		int[] a = {100, 200, 300};
		System.out.println("m.add(a) 결과: " + m.add(a));
	}
}

class Mymath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length; i++)
			result += a[i];
		return result;
	}
}

/* (실행결과:)

int add(int a, int b) - m.add(3, 3) 결과: 6
long add(long a, int b) - m.add(3L, 3) 결과: 6
long add(int a, long b) - m.add(3, 3L) 결과: 6
long add(long a, long b) - m.add(3L, 3L) 결과: 6
int add(int[] a) - m.add(a) 결과: 600

*/
