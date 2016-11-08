package com.test.common.innerclass;

interface testface {
	public void sayHello();
}

public class Parcel5 {
	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;
			private PDestination(String wehreto) {
				label = wehreto;
			}
			@Override
			public String readLabel() {
				return label;
			}
		}
		return new PDestination("deyang");
	}
	private class Inner implements testface{

		@Override
		public void sayHello() {
		}
		public testface getInnerInstance() {
			return new Inner();
		}
	}
	public static void main(String[] args) {
		Parcel5 parcel5 = new Parcel5();
		Destination destination = parcel5.destination("Tasmania");
	}
}