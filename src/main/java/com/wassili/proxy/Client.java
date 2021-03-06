package com.wassili.proxy;

public class Client {

	
	
	/**
	 * 
	 * 动态代理实现思路
	 * 实现功能：通过Proxy的newProxyInstance返回代理对象
	 * 1、声明一段代码（动态产生代理）
	 * 2、编译源码（JDK Compliler API），产生新的类（代理类）
	 * 3、将这个类load到内存中，产生一个新的对象（代理对象）
	 * 4、return代理对象
	 * 测试类
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class,h);
		m.move();
	}

}
