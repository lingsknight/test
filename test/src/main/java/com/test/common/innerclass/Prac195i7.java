package com.test.common.innerclass;

public class Prac195i7 {
	public static void main(String[] args) {
		new First().go();
	}
}
class First {
	private String msg;
	private void printMes(){
		System.out.println("msg: "+msg);
	}
	public void go(){
		Second second = new Second();
		second.newMsg("hello world");
		System.out.println(second.msg);
	}
	private class Second {
		private String msg = "I'm second class";
		public void newMsg(String msg) {
			First.this.msg = msg;
			First.this.printMes();
		}
	}
}
