package ch4;

public class FlowExx18 {

	public static void main(String[] args) {
		//구구단(2~9단)
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %2d%n", i, j, i*j);
			}
		}
	}

}
