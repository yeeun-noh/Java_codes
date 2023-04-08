package ch4;

public class FlowEx1 {

	public static void main(String[] args) {
		
		int x = 0;
		System.out.printf("x= %d일때, 참인것은 %n", x);
		
		if(x==0) System.out.println("x == 0");
		if(x!=0) System.out.println("x != 0");
		if(!(x==0)) System.out.println("!(x == 0)");
		if(!(x!=0)) System.out.println("!(x != 0)");
		
		x = 1;
		System.out.printf("\nx= %d일때, 참인것은 %n", x);

		if(x==0) System.out.println("x == 0");
		if(x!=0) System.out.println("x != 0");
		if(!(x==0)) System.out.println("!(x == 0)");
		if(!(x!=0)) System.out.println("!(x != 0)");	
	}

}

//	(실행결과 :)
//
//	x= 0일때, 참인것은 
//	x == 0
//	!(x != 0)
//
//	x= 1일때, 참인것은 
//	x != 0
//	!(x == 0)
