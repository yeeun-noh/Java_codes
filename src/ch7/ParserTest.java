package ch7;

interface Parseable {
	public abstract void parse(String fileName);
}

class ParserManager {
	//리턴타입이 Parseable인터페이스
	public static Parseable getParser(String type) {
		if(type.equals("XML"))
			return new XMLParser();
		else {
			Parseable p = new HTMLParser();
			return p;
			//한문장으로 가능: return new HTMLParser();
		}
	}
}

class XMLParser implements Parseable {

	@Override
	public void parse(String fileName) {
		System.out.println(fileName + "- XML parsing completed");
	}
}

class HTMLParser implements Parseable {

	@Override
	public void parse(String fileName) {
		System.out.println(fileName + "- HTML parsing completed");
	}
}

public class ParserTest {

	public static void main(String[] args) {

		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}

}

/* (실행결과:)

document.xml- XML parsing completed
document2.html- HTML parsing completed

*/
