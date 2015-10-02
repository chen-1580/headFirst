package com.ckx.decorate.condiment;

import com.ckx.decorate.basic.Beverage;
import com.ckx.decorate.basic.CondimentDecorator;

/**
 * еёдл
 * @author Apache
 *
 */
public class Milk extends CondimentDecorator {

	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		return .10 + beverage.cost();
	}

}
