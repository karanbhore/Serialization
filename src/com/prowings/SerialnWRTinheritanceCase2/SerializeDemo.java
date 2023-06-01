package com.prowings.SerialnWRTinheritanceCase2;

import java.io.*;

public class SerializeDemo {

	public static void main(String[] args) throws Exception{
		
		Dog d1=new Dog();
		System.out.println(d1.i+" "+d1.j);
		
		FileOutputStream fos=new FileOutputStream("klm.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis=new FileInputStream("klm.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		System.out.println(d2.i+" "+d2.j);
		
		
		
		
		
		
		
		
		
		
	}
}
