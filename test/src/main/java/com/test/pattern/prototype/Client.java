package com.test.pattern.prototype;

class Prototype implements Cloneable {

	@Override
	public Object clone() {
		Prototype prototype = null;
		try {
			prototype = (Prototype)super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prototype;
	}
}

class ConcretePrototype extends Prototype {
	public void show() {
		System.out.println("原型模式实现类");
	}
}

//客户端角色
public class Client {
	public static void main(String[] args) {
		ConcretePrototype cp = new ConcretePrototype();
		for (int i = 0; i < 10; i++) {
			ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
			clonecp.show();
		}
	}
}
