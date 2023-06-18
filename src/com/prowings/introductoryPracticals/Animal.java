package com.prowings.introductoryPracticals;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Animal implements Serializable {

	transient static String name;
	transient final int age;

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Animal() {
		this.age = 0;
//		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {

		Animal animal = new Animal("Horse", 10);
		System.out.println(animal);
		FileOutputStream fos = new FileOutputStream("animal.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(animal);
		System.out.println("object serialized successfully!!");

	}
}
