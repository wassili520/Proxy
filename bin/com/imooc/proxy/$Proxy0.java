package com.imooc.proxy;
import java.lang.reflect.Method;
import com.imooc.proxy.InvocationHandler;
public class $Proxy0 implements com.wassili.proxy.Moveable {
	public $Proxy0(InvocationHandler h) {
		this.h = h;
	}
  private InvocationHandler h;
	@Override
	public void move() {
  try{
  Method md = com.wassili.proxy.Moveable.class.getMethod("move");
  h.invoke(this,md);
  }catch(Exception e){ e.printStackTrace();}
	}
}