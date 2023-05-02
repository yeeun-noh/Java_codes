package chapter12;

import java.util.*;

class Fruit4 {
	String name;
	int weight;
	
	Fruit4(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() {
		return name + "(" + weight + ")";
	}
}

class Apple4 extends Fruit4 {
	Apple4(String name, int weight) {
		super(name, weight);
	}
}

class Grape4 extends Fruit4 {
	Grape4(String name, int weight) {
		super(name, weight);
	}
}

class AppleCompany implements Comparator<Apple4> {
	public int compare(Apple4 t1, Apple4 t2) {
		return t2.weight - t1.weight;
	}
}

class GrapeCompany implements Comparator<Grape4> {
	public int compare(Grape4 t1, Grape4 t2) {
		return t2.weight - t1.weight;
	}
}

class FruitCompany implements Comparator<Fruit4> {
	public int compare(Fruit4 t1, Fruit4 t2) {
		return t2.weight - t1.weight;
	}
}

public class FruitBoxEx4 {

	public static void main(String[] args) {
			
		FruitBox4<Apple4> appleBox = new FruitBox4<Apple4>();
		FruitBox4<Grape4> grapeBox = new FruitBox4<Grape4>();
		
		appleBox.add(new Apple4("Green Apple:", 300));
		appleBox.add(new Apple4("Green Apple:", 100));
		appleBox.add(new Apple4("Green Apple:", 200));
		
		grapeBox.add(new Grape4("Green Grape:", 400));
		grapeBox.add(new Grape4("Green Grape:", 200));
		grapeBox.add(new Grape4("Green Grape:", 300));
		
		Collections.sort(appleBox.getList(), new AppleCompany());
		Collections.sort(grapeBox.getList(), new GrapeCompany());
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		Collections.sort(appleBox.getList(), new FruitCompany());
		Collections.sort(grapeBox.getList(), new FruitCompany());
		System.out.println(appleBox);
		System.out.println(grapeBox);
	}

}

class FruitBox4<T extends Fruit4> extends Box4<T> {}

class Box4<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	
	ArrayList<T> getList() { return list; }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}

/* (실행 결과:)

[Green Apple:(300), Green Apple:(200), Green Apple:(100)]
[Green Grape:(400), Green Grape:(300), Green Grape:(200)]

[Green Apple:(300), Green Apple:(200), Green Apple:(100)]
[Green Grape:(400), Green Grape:(300), Green Grape:(200)]

*/
