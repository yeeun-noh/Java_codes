package chapter14;

import java.util.*;
import java.util.function.*;

public class LambdaEx6 {
	
	public static void main(String[] args) {

		IntSupplier s = ()-> (int)(Math.random()*100)+1;
		IntConsumer c = i-> System.out.print(i + ", ");
		IntPredicate p = i-> i%2==0;
		IntUnaryOperator op = i-> i%10*10; //i의 일의 자리를 없앰
		//==> 매개변수의 타입과 반환타입이 일치할때는 Function대신 UnaryOperator 사용하기!
		
		int[] arr = new int[10];
		
		makeRandomList(s, arr);
		System.out.println(Arrays.toString(arr));
		printEvenNum(p, c, arr);
		
		int[] newArr = doSomething(op, arr);
		System.out.println(Arrays.toString(newArr));
	}

	static int[] doSomething(IntUnaryOperator op, int[] arr) {
		int[] newArr = new int[arr.length];
		
		for(int i=0; i<newArr.length; i++)
			newArr[i] = op.applyAsInt(arr[i]); //apply()아니라, applyAsInt()임에 주의!
		return newArr;
	}

	static <T> void printEvenNum(IntPredicate p, IntConsumer c, int[] arr) {
		System.out.print("[");
		for(int i : arr) {
			if(p.test(i))
				c.accept(i);
		}
		System.out.println("]");
	}

	static void makeRandomList(IntSupplier s, int[] arr) {
		for(int i=0; i<arr.length; i++)
			arr[i] = s.getAsInt(); //get()이 아니라, getAsInt()임에 주의!
	}
}

/* (실행결과:)

[6, 58, 61, 32, 79, 98, 53, 84, 17, 98]
[6, 58, 32, 98, 84, 98, ]
[60, 80, 10, 20, 90, 80, 30, 40, 70, 80]

*/
