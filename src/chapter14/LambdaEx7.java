package chapter14;
//Function타입의 두 람다식을 합성 - andThen(), compose()
//Predicate의 결합 - and(), or(), negate(), isEqual()

import java.util.*;
import java.util.function.*;

public class LambdaEx7 {
	
	public static void main(String[] args) {

		Function<String, Integer> f = s-> Integer.parseInt(s, 16);
		Function<Integer, String> g = i-> Integer.toBinaryString(i);

		Function<String, String> h = f.andThen(g); 		//f + g => h
		Function<Integer, Integer> h2 = f.compose(g);	//g + f => h
		
		System.out.println(h.apply("FF"));	//"FF" => 255 => "11111111"
		System.out.println(h2.apply(2));	//2 => "10" => 16
		System.out.println("-----------------------------------------");
		
		Function<String, String> f2 = x-> x; //항등함수(identify function)
		System.out.println(f2.apply("AAA")); //"AAA"가 그대로 출력됨
		System.out.println("-----------------------------------------");

		Predicate<Integer> p = i-> i < 100;
		Predicate<Integer> q = i-> i < 200;
		Predicate<Integer> r = i-> i % 2 == 0;
		Predicate<Integer> notP = p.negate(); //i >= 100
		
		Predicate<Integer> all = notP.and(q).or(r); //100<=i && i<200 || i%2==0
		Predicate<Integer> all2 = notP.and(q.or(r)); //100<=i && (i<200 || i%2==0)

		System.out.println(all.test(150)); //true
		System.out.println(all2.test(50)); //false
		System.out.println("-----------------------------------------");

		String str1 = "abc";
		String str2 = "abc";
		
		//st1과 str2가 같은지 비교한 결과를 반환 => 비교는 isEqual()사용:
		Predicate<String> p2 = Predicate.isEqual(str1); //isEqual()은 static메서드
		boolean result = p2.test(str2); //str1과 str2가 같은지 비교한 결과를 반환
		
		//위의 두문장을 하나로 합치면:
		boolean result2 = Predicate.isEqual(str1).test(str2);
		System.out.println(result);  //true	
		System.out.println(result2); //true	
	}
}

/* (실행결과:)

11111111
16
-----------------------------------------
AAA
-----------------------------------------
true
false
-----------------------------------------
true
true

*/
