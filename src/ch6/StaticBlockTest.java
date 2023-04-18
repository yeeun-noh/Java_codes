package ch6;

public class StaticBlockTest {

	static int[] arr = new int[10];
	
	static {
		for(int i=0; i<arr.length; i++)
			arr[i] = (int)(Math.random()*10)+1;
	}		
			
	public static void main(String[] args) {
		
		for(int i=0;i<arr.length; i++)
			System.out.println("arr[" + i + "] :" + arr[i]);
	}

}

/* (실행결과:)

arr[0] :4
arr[1] :3
arr[2] :9
arr[3] :7
arr[4] :7
arr[5] :10
arr[6] :10
arr[7] :10
arr[8] :2
arr[9] :1

*/
