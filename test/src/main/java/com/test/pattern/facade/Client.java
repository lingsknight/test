package com.test.pattern.facade;

class DrawerOne {
	public void open() {
		System.out.println("第一个抽屉被打开了");
		getKey();
	}
	public void getKey() {
		System.out.println("得到第二个抽屉的钥匙");
	}
}

class DrawerTwo {
	public void open() {
		System.out.println("第二个抽屉被打开了");
		getFile();
	}
	public void getFile() {
		System.out.println("得到重要文件");
	}
}

class DrawerFacade {
	DrawerOne drawerOne = new DrawerOne();
	DrawerTwo drawerTwo = new DrawerTwo();
	public void open() {
		drawerOne.open();
		drawerTwo.open();
	}
}

public class Client {
	public static void main(String[] args) {
		DrawerFacade drawer = new DrawerFacade();
		drawer.open();
	}
}
