package com.prowings.SerialVersionUID;

import java.io.*;

public class Sender {

	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();

		FileOutputStream fos = new FileOutputStream("Dog.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);

	}
}
