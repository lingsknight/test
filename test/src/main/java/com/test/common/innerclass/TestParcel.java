package com.test.common.innerclass;

interface Destination {
	String readLabel();
}
interface Contents {
	int value();
}
class Parcel4 {
	
	private class PContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			return i;
		}
	}
	protected class PDestination implements Destination {
		private String label;
		private PDestination(String whereTo) {
			this.label = whereTo;
		}
		@Override
		public String readLabel() {
			return label;
		}
	}
	public Destination destination(String s) {
		return new PDestination(s);
	}
	public Contents contents() {
		return new PContents();
	}
}
class TestClass {
	private TestClass(){};
}

public class TestParcel {
	public static void main(String[] args) {
		Parcel4 parcel = new Parcel4();
		Contents c = parcel.contents();
		Destination d = parcel.destination("deyang");
		//下面这条语句是编译不过的 The constructor Parcel4.PDestination(String) is not visible
//		Parcel4.PDestination destination = parcel.new PDestination("deyang");
	}
}
