package com.test.common.innerclass;

public class DoThis {
	public void f(){
		System.out.println("DoThis.f()");
	}
	public class Inner {
		public DoThis outer() {
			return DoThis.this;
		}
	}
	public Inner inner() {
		return new Inner();
	}
	public static void main(String[] args) {
		DoThis dt = new DoThis();
		DoThis.Inner dti = dt.inner();
		dti.outer().f();
	}
}
