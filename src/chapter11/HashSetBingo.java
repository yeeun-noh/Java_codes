package chapter11;
// HashSet - 빙고판 만들기

import java.util.*;

public class HashSetBingo {

	public static void main(String[] args) {

		Set set = new HashSet();
//		Set set = new LinkedHashSet();
		int[][] board = new int[5][5];
		
		for(int i=0; set.size()<25; i++)
			set.add((int)(Math.random()*50) + 1 + "");

		Iterator it = set.iterator();
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}
	}
	
}

/* (실행 결과:)

 44 22 23 46 24
 47 25 26 49 27
 32 10 15 37 38
 16 17  2  4  7
  8 40 41 20 21

*/
