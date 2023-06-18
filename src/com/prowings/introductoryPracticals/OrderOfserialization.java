package com.prowings.introductoryPracticals;

import java.io.*;

public class OrderOfserialization {

	public static void main(String[] args) throws Exception {
		
		Dog d1=new Dog();
		Cat c1=new Cat();
		Rat r1=new Rat();
		
		FileOutputStream fos=new FileOutputStream("pqr.ser"); 
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(r1);
		oos.writeObject(c1);
		oos.writeObject(d1);
		
		FileInputStream fis=new FileInputStream("pqr.ser"); 
		ObjectInputStream ois=new ObjectInputStream(fis);
		
//		Cat c2=(Cat)ois.readObject();
//		Rat r2=(Rat)ois.readObject();
//		Dog d2=(Dog)ois.readObject();
//		
//		System.out.println("deserialized successfully!!!");
//		System.out.println("d2.i:"+d2.i+"  "+" r2.l:"+r2.l);

		Object o=ois.readObject();
		if(o instanceof Dog) {
			Dog d2=(Dog)o;
			System.out.println(d2.i);
			System.out.println("this is dog");
		}
		else if(o instanceof Rat) {
			Rat r2=(Rat)o;
			System.out.println(r2.l);
			System.out.println("this is rat");
		}
		else {
			Cat c2=(Cat)o;
			System.out.println(c2.k);}
		
		
		
		
		
		
	}
}
