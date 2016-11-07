package com.test.pattern.flyweight;

import java.util.Hashtable;

abstract class Flyweight {
	public abstract void operation();
}

class ConcreteFlyweight extends Flyweight {
	
	private String str;
	public ConcreteFlyweight(String str) {
		this.str=str;
	}
	@Override
	public void operation() {
		System.out.println("Concrete---Flyweight: "+str);
	}
}

//再定义一个工厂方法类
class FlyweightFactory {
	private Hashtable flyweights = new Hashtable();
	public Flyweight getFlyweight(Object obj) {
		Flyweight flyweight = (Flyweight)flyweights.get(obj);
		if(flyweight == null) {
			flyweight = new ConcreteFlyweight((String) obj);
			flyweights.put(obj, flyweight);
		}
		return flyweight;
	}
	public int getFlyweightSize() {
		return flyweights.size();
	}
}
public class FlyweightTest {
	FlyweightFactory factory = new FlyweightFactory();
	Flyweight fly1,fly2,fly3,fly4,fly5;
	public static void main(String[] args) {
		System.out.println("The Flyweight Pattern");
		FlyweightTest test = new FlyweightTest();
		test.showFlyweight();
	}
	public FlyweightTest() {
		fly1 = factory.getFlyweight("Google");
		fly2 = factory.getFlyweight("Qutr");
		fly3 = factory.getFlyweight("Google");
		fly4 = factory.getFlyweight("Google");
		fly5 = factory.getFlyweight("Google");
	}
	public void showFlyweight() {
		fly1.operation();
		fly2.operation();
		fly3.operation();
		fly4.operation();
		fly5.operation();
		int objSize = factory.getFlyweightSize();
		System.out.println("objSize = " + objSize);
	}
}
