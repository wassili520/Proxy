package com.wassili.proxy;

import java.lang.reflect.Method;

public interface InvocationHandler {

	public void invoke(Object o,Method m);
}
