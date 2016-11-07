package com.test.pattern.adapter;

//旧接口
interface IQuery {
	public void query();
}

//旧系统的查询服务
class Query implements IQuery{

	public void query() {
		System.out.println("hello I'm Query");
	}
}

//新接口
interface ISelect {
	public void getList();
}

//通过适配器完成转配工作 (类适配器模式)
class QueryAdatperBaseClass extends Query implements ISelect {

	public void getList() {
		super.query();
	}
}

//通过适配器完成转配工作 (对象适配器模式)
class QueryAdapterBaseObject implements ISelect {
	private Query query = new Query();
	public void getList() {
		query.query();
	}
}

/**
 * @author wangx
 * @Date: 2016年8月15日 
 * @func: 适配器测试
 * @Copyright: 2016 wangx. All rights reserved.
 */
public class AdapterTest {
	public static void main(String[] args) {
		
		//类适配器测试
		ISelect adapter = new QueryAdatperBaseClass();
		adapter.getList();
		
		//对象适配器测试
		adapter = new QueryAdapterBaseObject();
		adapter.getList();
	}
}
