package ch2;

public class VarExl2 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0; // 임시변수
		
		System.out.println("x:" + x + " y:" + y); //ctrl + alt + 아래방향키 = 카피
		System.out.println("-----------------------");
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x:" + x + " y:" + y);
		System.out.println("tmp: " + tmp);		
	}

}
