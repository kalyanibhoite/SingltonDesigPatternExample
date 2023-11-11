package com.singlton.Example;

public class MySingltonClass {

	private static MySingltonClass s;

	private MySingltonClass() {
	}

	public static MySingltonClass x() {
		if (s == null) {
			s = new MySingltonClass();
		}
		return s;

	}

}
