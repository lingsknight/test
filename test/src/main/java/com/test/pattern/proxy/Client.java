package com.test.pattern.proxy;

//subject 抽象主题 定义主要功能
interface Subject {
	public void operation();
}

//realsubject 具体主题
class Realsubject implements Subject {

	public void operation() {
		System.out.println("realsubject operation started.");
	}
}

//Proxy
class Proxy implements Subject {
	private Subject subject;
	public Proxy(Subject subject) {
		this.subject=subject;
	}
	public void operation() {
		System.out.println("proxy fronties operation.");
		subject.operation();
		System.out.println("proxy end operation.");
	}
}
public class Client {
	public static void main(String[] args) {
		Subject subject = new Realsubject();
		Proxy proxy = new Proxy(subject);
		proxy.operation();
	}
}
