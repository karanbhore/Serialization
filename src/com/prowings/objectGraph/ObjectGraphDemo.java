package com.prowings.objectGraph;
import java.io.*;
public class ObjectGraphDemo {

	public static void main(String[] args) throws Exception{
		
		Dog d1=new Dog();
		
		FileOutputStream fos=new FileOutputStream("xyz.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);

		System.out.println("object serialized!!!!");
		
		FileInputStream fis=new FileInputStream("xyz.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		
		System.out.println(d2.c.r.j);

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
