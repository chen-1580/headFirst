package com.ckx.decorate.condiment;

import com.ckx.decorate.basic.Beverage;
import com.ckx.decorate.basic.CondimentDecorator;

/**
 * Ä¦¿¨
 * @author Apache
 *
 */
public class Mocha extends CondimentDecorator {

	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		return .20 + beverage.cost();
	}

}
