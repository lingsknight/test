package com.test.common.innerclass;

public class Parcel3 {
	
	public class Hello{
		
	}
	class Contents {
		private int i=11;
		public int value(){
			return i;
		}
	}
	class Destination {
		private String label;
		Destination(String whereTo) {
			this.label=whereTo;
		}
		String readLable() {
			return label;
		}
	}
	public static void main(String[] args) {
		Parcel3 pacel = new Parcel3();
		Parcel3.Contents contents = pacel.new Contents();
		Parcel3.Destination destination = pacel.new Destination("Tasmanisa");
	}
}
