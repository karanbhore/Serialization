package com.prowings.customSerializationDemo;

import java.io.*;
import java.io.Serializable;

public class Account implements Serializable {

	String un = "Durga";
	transient String pwd = "Anushka";
	transient int pin = 1234;

	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();

		String epwd = "123" + pwd;
		oos.writeObject(epwd);

		int epin = 4444 + pin;
		oos.writeInt(pin);

	}

	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();

		String epwd = (String) ois.readObject();
		pwd = epwd.substring(3);

		int epin = ois.readInt();
		pin =epin-4444 ;

	}

}
