package com.test.reflection.sample;

class Person {
	private String name;
	public void sayHello() {
		System.out.println("Hello,I'm "+name);
	}
}

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class c = Class.forName("com.test.reflection.sample.Person");
		String name = c.getName();
		System.out.println(name);
		Class superClss = c.getSuperclass();
		if(superClss != null)
			System.out.println(superClss.newInstance());
		System.out.println(c.newInstance());
	}
}
