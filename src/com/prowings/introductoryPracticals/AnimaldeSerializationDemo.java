package com.prowings.introductoryPracticals;

import java.io.*;

public class AnimaldeSerializationDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("animal.txt"); 
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Animal animal=(Animal)ois.readObject();
		
		System.out.println(animal);
		
		
	}
}
