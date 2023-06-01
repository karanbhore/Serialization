package com.prowings.SerialVersionUID;

import java.io.*;

public class Sender {

	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();

		FileOutputStream fos = new FileOutputStream("456.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);

	}
}
