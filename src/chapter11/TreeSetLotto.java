package chapter11;
// TreeSet - 로또번호 만들기

import java.util.*;

public class TreeSetLotto {

	public static void main(String[] args) {

		Set set = new TreeSet();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45) + 1;
			//set.add(new Integer(num));을 자동으로 오토박싱함:
			set.add(num); 
		}
		System.out.println(set); //이미 정렬하기 때문에 읽어올때 따로 정렬할 필요 없음! (HashSet과 다른점)
	}
	
}

/* (실행 결과:)

[13, 17, 18, 19, 25, 28]

*/
