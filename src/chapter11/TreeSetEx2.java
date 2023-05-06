package chapter11;
// TreeSet
// - headSet(), tailSet()

import java.util.*;

public class TreeSetEx2 {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i=0; i<score.length; i++)
//			set.add(new Integer(score[i]));이 오토박싱됨:
			set.add(score[i]);
		
		System.out.println("50보다 작은 값: " + set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값: " + set.tailSet(new Integer(50)));
	}
	
}

/* (실행 결과:)

50보다 작은 값: [10, 35, 45]
50보다 큰 값: [50, 65, 80, 95, 100]

*/
