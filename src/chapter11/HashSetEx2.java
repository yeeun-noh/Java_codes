package chapter11;
// HashSet

import java.util.*;

public class HashSetEx2 {

	public static void main(String[] args) {

		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		System.out.println(set);

		System.out.println("-------------------------");

		HashSet set2 = new HashSet();
		set2.add("abc");
		set2.add("abc");
		set2.add(new Person2("David", 10));
		set2.add(new Person2("David", 10));
		System.out.println(set2);
	}
	
}

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}	
	
	public String toString() {
		return name + ":" + age;
	}
}

class Person2 {
	String name;
	int age;
	
	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}	
		
	public String toString() {
		return name + ":" + age;
	}
	
//	﻿equals()와 hashCode()를 호출:
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age==tmp.age;
		}
		return false;
	}
	
	public int hashCode() {
		return (name+age).hashCode();
	}
}

/* (실행 결과:)

[abc, David:10, David:10]
-------------------------
[abc, David:10]

*/
