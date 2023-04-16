package ch5;

import java.util.Scanner;

public class MultiArrEx4 {

	public static void main(String[] args) {
//		(4) 맞추기 : 영어 단어를 보여주고, 뜻을 맞추는 게임
		
		String[][] words = {
			{"chair", "의자"},      //words[0][0],words[0][1]
			{"computer", "컴퓨터"}, //words[1][0],words[1][1]
			{"integer", "정수"}     //words[2][0],words[2][1]
		};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
		
			String str = sc.nextLine();
			if(str.equals(words[i][1]))
				System.out.printf("정답입니다!%n%n");
			else
				System.out.printf("틀렸습니다! 정답은 %s입니다!%n%n", words[i][1]);
		}
	}
	
}

/* (실행결과:)

Q1. chair의 뜻은? 책상
틀렸습니다! 정답은 의자입니다!

Q2. computer의 뜻은? 컴퓨터
정답입니다!

Q3. integer의 뜻은? 정수
정답입니다!

*/
