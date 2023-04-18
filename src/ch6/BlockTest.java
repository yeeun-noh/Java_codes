package ch6;

public class BlockTest {

	//클래스 초기화 블럭:
	//클래스가 메모리에 처음 로딩될 때 한번만 수행됨
	static {
		System.out.println("static { }");
	}
	
	//인스턴스 초기화 블럭: 
	//인스턴스를 생성될 때마다 생성자보다 먼저 수행됨
	{
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();		
	}

}

/* (실행결과:)

static { }
BlockTest bt = new BlockTest();
{ }
생성자
BlockTest bt2 = new BlockTest();
{ }
생성자

*/
