package ch4;

public class FlowExx33 {

	public static void main(String[] args) {
		// for문에 loop1이라는 이름을 붙임
		Loop1 :	for(int i=2; i<=9; i++) {
					for(int j=1; j<=9; j++) {
							if(j==5) {
								break Loop1; // 반복문에 이름을 붙여주고, break문에 반복문이름을 지정해주면, 하나 이상의 반복문도 벗어날수 있음
//								break;
//								continue Loop1;
//								continue;
							}
							System.out.println(i + "*" + j + "=" + i*j);
					}
					System.out.println();
		} // end of Loop1
	}

}

// (실행결과 :)
//
// 2*1=2
// 2*2=4
// 2*3=6
// 2*4=8
