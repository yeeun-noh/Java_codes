package ch4;

public class FlowExx19 {

	public static void main(String[] args) {
		// 3개의 반복문이 중첩 되어 있음 :
		for(int i=1; i<=3; i++)
			for(int j=1; j<=3; j++)
				for(int k=1; k<=3; k++)
				System.out.println("" + i + j + k);
	}

}
//	(실행결과 :)
//
//	111
//	112
//	113
//	121
//	122
//	123
//	131
//	132
//	133
//	211
//	212
//	213
//	221
//	222
//	223
//	231
//	232
//	233
//	311
//	312
//	313
//	321
//	322
//	323
//	331
//	332
//	333
