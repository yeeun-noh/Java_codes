package ch8;

public class ChainedExceptionEx {

	public static void main(String[] args) {
		try {
			throw new Exception("a");
		} catch(Exception e) {
			Exception e2 = new Exception("b");
			e2.initCause(e);
			try {
				throw e2;
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}
	}
}

/* (실행결과:)

java.lang.Exception: b
	at ch8.ChainedExceptionEx.main(ChainedExceptionEx.java:9)
Caused by: java.lang.Exception: a
	at ch8.ChainedExceptionEx.main(ChainedExceptionEx.java:7)

*/
