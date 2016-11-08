package com.test.common.innerclass;

public class Outer {
	private String msg;

	public Outer(String msg) {
		this.msg=msg;
	}
	private class Inner {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "outer's msg: "+msg;
		}
	}

	public Inner getInnerInstance() {
		return new Inner();
	}

	public static void main(String[] args) {
		System.out.println(new Outer("Outer").getInnerInstance().toString());
	}
}
