package com.test.pattern.bridge;

//实现接口
interface Implementor {
	public void operationImpl();
}

abstract class Abstraction {
	protected Implementor implementor;
	
	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}
	
	public void operation() {
		implementor.operationImpl();
	}
}

class ConcreteImplementorA implements Implementor {

	public void operationImpl() {
		System.out.println("具体实现A");
	}
}

class ConcreteImplementorB implements Implementor {

	public void operationImpl() {
		System.out.println("具体实现B");
	}
}

class RefinedAbstraction extends Abstraction{

	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}
	
	public void otherOperation() {
		System.out.println("其他操作");
	}
}

public class Test {
	public static void main(String[] args) {
		Implementor implementor = new ConcreteImplementorA();
		RefinedAbstraction abstraction = new RefinedAbstraction(implementor);
		abstraction.operation();
		abstraction.otherOperation();
	}
}