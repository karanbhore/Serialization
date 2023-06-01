package com.prowings.customSerializationDemo;

import java.io.*;

public class CustomSerializationDemo {

	public static void main(String[] args) throws Exception {

		Account al = new Account();
		System.out.println(al.un + " " + al.pin + " " + al.pwd);

		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account al2 = (Account) ois.readObject();

		System.out.println(al2.un + " " + al.pin+ " " + al2.pwd);

	}

}
