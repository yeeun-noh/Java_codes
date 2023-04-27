package ch12;
//지네릭스(Generics)

import java.util.ArrayList;

class Fruit {
	@Override
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	@Override
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	@Override
	public String toString() {
		return "Grape";
	}
}

class Toy {
	@Override
	public String toString() {
		return "Toy";
	}
}

public class FruitBoxEx1 {

	public static void main(String[] args) {

		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
//		Box<Grape> grapeBox = new Box<Apple>(); //에러, 타입 불일치
		Box<Grape> grapeBox = new Box<Grape>();
		Box<Toy> toyBox = new Box<Toy>();
		
		// void add(T item) 에 T대신 Fruit이오기 때문에 받을수 있는 타입은 Fruit가능 + 이를 상속하고 있는 Apple도 가능:
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		
		// void add(T item) 에 T대신 Apple이오기 때문에 받을수 있는 타입은 Apple만 가능:
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); => 불가능
		
		// void add(T item) 에 T대신 Toy이오기 때문에 받을수 있는 타입은 Toy만 가능:
		toyBox.add(new Toy());
//		toyBox.add(new Apple()); => 불가능
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}

}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
}

/* (실행 결과:)

[Fruit, Apple]
[Apple]
[Toy]

*/
