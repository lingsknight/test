package com.test.pattern.decorator;

//组件对象的接口，可以给这些对象动态地添加职责
abstract class Component {
	public abstract void operation();
}

//具体组件
class ConcreteComponent extends Component {

	@Override
	public void operation() {
		
	}
}

//装饰器接口，维持一个指向组件对象的接口对象， 并定义一个与组件接口一致的接口
abstract class Decorator extends Component {
	
	/** 持有组件对象 */
	protected Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	public void operation() {
		component.operation();
	}
}

//装饰器的具体实现对象
class ConcreteDecoratorA extends Decorator {
	public ConcreteDecoratorA(Component component) { 
		super(component);
	}	
	
	private void operationFirst() {}
	private void operationLast() {}
	public void operation() {
		operationFirst();
		super.operation();
		operationLast();
	}
}

class ConcreteDecoratorB extends Decorator {
	public ConcreteDecoratorB(Component component) { 
		super(component);
	}	
	
	private void operationFirst() {}
	private void operationLast() {}
	public void operation() {
		operationFirst();
		super.operation();
		operationLast();
	}
}

public class Client {
	public static void main(String[] args) {
		Component c1 = new ConcreteComponent();
		Decorator decoratorA = new ConcreteDecoratorA(c1);  //给对象透明的增加功能A并调用  
		decoratorA.operation();
		Decorator decoratorB = new ConcreteDecoratorB(c1); //给对象透明的增加功能B并调用
		decoratorB.operation();
		Decorator decoratorBandA = new ConcreteDecoratorB(decoratorA);//装饰器也可以装饰具体的装饰对象，此时相当于给对象在增加A的功能基础上在添加功能B  
	    decoratorBandA.operation();  
	}
}