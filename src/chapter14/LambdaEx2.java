package chapter14;

@FunctionalInterface
interface MyFunctions {
	void myMethod(); // == public abstract void myMethod(); (추상메서드)
}

public class LambdaEx2 {
	
	public static void main(String[] args) {
		
		MyFunctions f = ()-> {}; // == MyFunctions f = (MyFunctions)(() -> {});
		Object obj = (MyFunctions)(()-> {}); //Object타입으로 형변환이 생략됨
		String str = ((Object)(MyFunctions)(()-> {})).toString();
	
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
//		System.out.println(()-> {}); //에러, 람다식은 Object타입으로 형변환 안됨
		System.out.println((MyFunctions)(()-> {}));
//		System.out.println((MyFunctions)(()-> {}).toString()); //에러
		System.out.println(((Object)(MyFunctions)(()-> {})).toString());
		
	}
}

//일반적인 익명객체라면, 객체의 타입이 "외부클래스이름$번호" 와 같은 형식으로 타입이 결정되었을텐데,
//람다식의 타입은 "외부클래스이름$$Lambda$$번호" 와 같은 형식으로 되어 있음!

/* (실행결과:)

chapter14.LambdaEx2$$Lambda$1/0x0000000800000bf8@5577140b
chapter14.LambdaEx2$$Lambda$2/0x0000000800001000@6073f712
chapter14.LambdaEx2$$Lambda$3/0x0000000800001218@6a38e57f
chapter14.LambdaEx2$$Lambda$4/0x0000000800001430@3d04a311
chapter14.LambdaEx2$$Lambda$5/0x0000000800001648@5f205aa

*/
