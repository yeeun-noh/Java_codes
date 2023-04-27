package chapeter12;
//지네릭스(Generics)

import java.util.ArrayList;

interface Eatable {}

class Fruit2 implements Eatable {
	@Override
	public String toString() {
		return "Fruit";
	}
}

class Apple2 extends Fruit2 {
	@Override
	public String toString() {
		return "Apple";
	}
}

class Grape2 extends Fruit2 {
	@Override
	public String toString() {
		return "Grape";
	}
}

class Toy2 {
	@Override
	public String toString() {
		return "Toy";
	}
}


public class FruitBoxEx2 {

	public static void main(String[] args) {

		FruitBox<Fruit2> fruitBox = new FruitBox<Fruit2>();
		FruitBox<Apple2> appleBox = new FruitBox<Apple2>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); //에러, 타입 불일치
		FruitBox<Grape2> grapeBox = new FruitBox<Grape2>();
//		FruitBox<Toy2> toyBox = new FruitBox<Toy2>(); //에러, <T extends Fruit2 & Eatable>에 포함되지 않으므로
		
		fruitBox.add(new Fruit2());
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
//		appleBox.add(new Grape2()); //에러, Grape는 Apple의 자손이 아님
		grapeBox.add(new Grape2());
		
		System.out.println("fruitBox- " + fruitBox);
		System.out.println("appleBox- " + appleBox);
		System.out.println("grapeBox- " + grapeBox);
	}

}

class FruitBox<T extends Fruit2 & Eatable> extends Box2<T> {};

class Box2<T> {
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

fruitBox- [Fruit, Apple, Grape]
appleBox- [Apple]
grapeBox- [Grape]

*/
