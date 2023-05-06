package chapter11;
// HashMap

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("admin", "1111");
		map.put("admin", "1234");
		//key는 중복허용X, value는 중복허용O:
		//key: myId, admin
		//value: 1234, 1234
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력!");
			System.out.print("id: ");
			String id = sc.nextLine().trim();
			
			System.out.print("password: ");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않음, 다시 입력!");
				continue;
			}
			
			if(!map.get(id).equals(password))
				System.out.println("비밀번호 불일치, 다시 입력!");
			else {
				System.out.println("id와 비밀번호 일치!");
				break;
			}		
		}
	}
	
}

/* (실행 결과:)

id와 password를 입력!
id: admin
password: 1111

비밀번호 불일치, 다시 입력!
id와 password를 입력!
id: admin
password: 1234

id와 비밀번호 일치!

*/
