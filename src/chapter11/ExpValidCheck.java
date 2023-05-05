package chapter11;
//입력한 수식의 괄호가 올바른지를 체크:

import java.util.*;

public class ExpValidCheck {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("Usage: java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example: java ExpValidCheck \"((2+3)*1)+3\"");
			System.exit(0); //종료
		}
		
		Stack st = new Stack();
		String expression = args[0];
		System.out.println("expression: " + expression);
		
		try {
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				if(ch == '(')
					st.push(ch+"");
				else if(ch == ')')
					st.pop();
			}
			
			if(st.isEmpty())
				System.out.println("괄호가 일치");
			else
				System.out.println("괄호가 불일치");
		} catch (EmptyStackException E) {
			System.out.println("괄호가 불일치");
		}
	}
}

/* (실행 결과:) Run > Run Configurations > Arguments

//아무것도 넣지 않으면
Usage: java ExpValidCheck "EXPRESSION"
Example: java ExpValidCheck "((2+3)*1)+3"

//((2+3)*1)+3 넝으면
expression: ((2+3)*1)+3
괄호가 일치함

//(2+3)*1) 넣으면
expression: (2+3)*1)
괄호가 불일치함

*/
