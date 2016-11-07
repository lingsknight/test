package com.test.pattern.builder;

import com.test.util.txtana.Main;

//待构建产品
class StarBucks {
	private String size;
	private String drink;
	
	public void setSize(String size) {
		this.size=size;
	}
	
	public void setDrink(String drink) {
		this.drink=drink;
	}
}

//抽象builder
abstract class StarBucksBuilder {
	protected StarBucks starbucks;
	
	public StarBucks getStarBucks() {
		return starbucks;
	}
	
	public void createStarBucks() {
		starbucks = new StarBucks();
		System.out.println("one drink is created");
	}
	
	public abstract void buildSize();
	public abstract void buildDrink();
}

//泡茶builder
class TeaBuilder extends StarBucksBuilder {

	@Override
	public void buildSize() {
		// TODO Auto-generated method stub
		starbucks.setSize("medium");
		System.out.println("build medium size");
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		starbucks.setDrink("tea");
		System.out.println("build tea");
	}
}

//泡咖啡builder
class CoffeeBuilder extends StarBucksBuilder {

	@Override
	public void buildSize() {
		// TODO Auto-generated method stub
		starbucks.setSize("medium");
		System.out.println("medium size");
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		starbucks.setDrink("coffee");
		System.out.println("build coffee");
	}
}

//指导如何封装builder
class Waiter {
	private StarBucksBuilder starBucksBuilder;

	public void setStarBucksBuilder(StarBucksBuilder starBucksBuilder) {
		this.starBucksBuilder = starBucksBuilder;
	}
	
	public StarBucks getStarBucksDrink() {
		return starBucksBuilder.getStarBucks();
	}
	
	public void constructStarBucks() {
		starBucksBuilder.createStarBucks();
		starBucksBuilder.buildDrink();
		starBucksBuilder.buildSize();
	}
}
//客户
public class BuilderTest {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		StarBucksBuilder coffeeBuilder = new CoffeeBuilder();
		//用builder泡咖啡
		waiter.setStarBucksBuilder(coffeeBuilder);
		waiter.constructStarBucks();
		
		//取到饮料
		StarBucks drink = waiter.getStarBucksDrink();
	}
}
