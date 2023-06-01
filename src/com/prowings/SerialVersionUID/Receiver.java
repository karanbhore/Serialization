package com.prowings.SerialVersionUID;

import java.io.*;

public class Receiver {

	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("456.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Dog d2=(Dog)ois.readObject();
		
		System.out.println(d2.i+" "+d2.j);
		
		
		
		
		
	}
}
