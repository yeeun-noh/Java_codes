package chapter11;
// Iterator

import java.util.*;

public class IteratorEx2 {

	public static void main(String[] args) {

		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i=0; i<10; i++)
			original.add(i+"");
		
		Iterator it = original.iterator();
		while(it.hasNext())
			copy1.add(it.next());
		
		System.out.println("= original에서 copy1로 복사(copy) =");
		System.out.println("original: " + original);
		System.out.println("copy1:    " + copy1);
		System.out.println();
		
		it = original.iterator(); //Iterator은 재사용이 안되므로, 다시 얻어와야함!
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove(); //copy2로 이동후 original배열 안 지움
		}
		
		System.out.println("= original에서 copy2로 이동(move) =");
		System.out.println("original: " + original);
		System.out.println("copy2:    " + copy2);
	}
	
}

/* (실행 결과:)

= original에서 copy1로 복사(copy) =
original: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
copy1:    [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

= original에서 copy2로 이동(move) =
original: []
copy2:    [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

*/
