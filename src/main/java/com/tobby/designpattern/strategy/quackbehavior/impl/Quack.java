package com.tobby.designpattern.strategy.quackbehavior.impl;

import com.tobby.designpattern.strategy.quackbehavior.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack...");
	}

}
