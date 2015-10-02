package com.ckx.decorate.condiment;

import com.ckx.decorate.basic.Beverage;
import com.ckx.decorate.basic.CondimentDecorator;

/**
 * длещ
 * @author Apache
 *
 */
public class Whip extends CondimentDecorator {

	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public double cost() {
		return .10 + beverage.cost();
	}

}
