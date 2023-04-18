package ch6;

class Document {
	static int count = 0;
	String name;	// 문서명

	Document(){		// 문서 생성시 문서명을 지정하지 않았을 때
		this("제목없음" + ++count); //this()는 다음생성자를 먼저 호출하기때문에 line11을 먼저 수행하고 이자리로 돌아와 그 다음을 수행
	}
	
	Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다");
	}
}

public class DocumentTest {

	public static void main(String[] args) {

		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
		}

}

/* (실행결과:)

문서 제목없음1가 생성되었습니다
문서 자바.txt가 생성되었습니다
문서 제목없음2가 생성되었습니다
문서 제목없음3가 생성되었습니다

 */
