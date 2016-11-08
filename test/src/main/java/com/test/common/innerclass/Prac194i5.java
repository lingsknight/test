package com.test.common.innerclass;

public class Prac194i5 {
	public static void main(String[] args) {
		Parent.Child child = new Parent().new Child();
	}
}

class Parent{
	class Child{
		
	}
}