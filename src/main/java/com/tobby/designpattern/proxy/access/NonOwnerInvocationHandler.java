package com.tobby.designpattern.proxy.access;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {

	PersonBean person;

	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws AccessException {
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			} else if (method.getName().startsWith("setHotOrNot")) {
				return method.invoke(person, args);
			} else if (method.getName().startsWith("set")) {
				throw new AccessException();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
