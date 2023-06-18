package com.prowings.Externalization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class AccountExternalization implements Externalizable{

	String userName;
	int password;
	
	
	public AccountExternalization(String userName, int password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public AccountExternalization() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "AccountExternalization [userName=" + userName + ", password=" + password + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(userName);
		
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		userName=(String)in.readObject();
		
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		AccountExternalization accountExternalization=new AccountExternalization("karan", 122);
		System.out.println(accountExternalization);
		
		FileOutputStream fos=new FileOutputStream("accountExternalization.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(accountExternalization);
		
		FileInputStream fis=new FileInputStream("accountExternalization.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		AccountExternalization accountExternalization2=(AccountExternalization)ois.readObject();
		System.out.println(accountExternalization2);
		
		
		
		
		
		
		
		
		
		
	}

	
}
