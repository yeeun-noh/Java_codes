package ch4;

public class FlowExx30 {

	public static void main(String[] args) {

		int i = 0, sum = 0;
		
		while(true) {
			if(sum > 100)
				break;
			++i;
			sum += i;
		}
		
		System.out.println("i= " + i + ", sum= " + sum);
	}

}

// (실행결과 :)
//
// i= 14, sum= 105
