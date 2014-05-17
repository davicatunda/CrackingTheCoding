package cap03;

import java.util.LinkedList;
import java.util.Queue;

class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	public String toString() {
		return "I'm " + name + ", a animal";
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	public String toString() {
		return "I'm " + name + ", a dog";
	}
}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	public String toString() {
		return "I'm " + name + ", a cat";
	}
}

class Wrapper {
	public Animal animal;
	public int id;
	static int count = 0;

	Wrapper(Animal animal) {
		this.animal = animal;
		id = count;
		count++;

	}
}

public class Question7 {
	static Queue<Wrapper> cat = new LinkedList<Wrapper>();
	static Queue<Wrapper> dog = new LinkedList<Wrapper>();
	int count = 0;

	static void enqueue(Cat animal) {
		cat.add(new Wrapper(animal));
		return;
	}

	static void enqueue(Dog animal) {
		dog.add(new Wrapper(animal));
		return;
	}

	static Animal dequeueAny(){
		if(cat.isEmpty() && dog.isEmpty())
			return null;
		if(cat.isEmpty())
			return dog.poll().animal;
		if(dog.isEmpty())
			return cat.poll().animal;
		if(dog.peek().id>cat.peek().id){
			return cat.poll().animal;
		} else {
			return dog.poll().animal;
		}
	}

	static Animal dequeueDog() {
		return dog.poll().animal;
	}

	static Animal dequeueCat() {
		return cat.poll().animal;
	}

	public static void main(String[] args) {
		Cat cat1 = new Cat("gatito1");
		Cat cat2 = new Cat("gatito2");
		Cat cat3 = new Cat("gatito3");
		Dog dog1 = new Dog("dogão1");
		Dog dog2 = new Dog("dogão2");
		Dog dog3 = new Dog("dogão3");
		enqueue(dog3);
		enqueue(cat1);
		enqueue(dog2);
		enqueue(dog1);
		enqueue(cat2);
		enqueue(cat3);

		System.out.println(dequeueDog() + "\n" + dequeueDog() + "\n"
				+ dequeueAny());
	}

}
