package com.test.common.innerclass;

public class Parcel7 {
	public Wrapping contents(int x) {
//		return new Contents() {
//			private int i=11;
//			@Override
//			public int value() {
//				return i;
//			}
//		};
		return new Wrapping(x){
			@Override
			public int value() {
				// TODO Auto-generated method stub
				return super.value();
			}
		};
	}
	public static void main(String[] args) {
//		Parcel7 parcel = new Parcel7();
//		Contents contents = parcel.contents(5);
	}
}

class Wrapping {
	private int i;
	public Wrapping(int x) {
		this.i=x;
	}
	public int value() {
		return i;
	}
}

