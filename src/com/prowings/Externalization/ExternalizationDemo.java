package com.prowings.Externalization;

import java.io.*;

public class ExternalizationDemo implements Externalizable {

	String s;
	int i;
	int j;

	public ExternalizationDemo() {
		super();
		System.out.println("no arg constructor !!!");
	}

	public ExternalizationDemo(String s, int i, int j) {
		super();
		this.s = s;
		this.i = i;
		this.j = j;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(i);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		s = (String) in.readObject();
		i = in.readInt();

	}

	public static void main(String[] args) throws Exception {

		ExternalizationDemo t1 = new ExternalizationDemo("Durga", 10, 20);

		FileOutputStream fos = new FileOutputStream("123.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t1);

		FileInputStream fis = new FileInputStream("123.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizationDemo t2 = (ExternalizationDemo) ois.readObject();
		System.out.println(t2.s + " " + t2.i + " " + t2.j);

	}

}
