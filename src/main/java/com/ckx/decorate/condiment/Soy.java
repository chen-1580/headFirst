package com.ckx.decorate.condiment;

import com.ckx.decorate.basic.Beverage;
import com.ckx.decorate.basic.CondimentDecorator;

/**
 * ¶¹½¬
 * @author Apache
 *
 */
public class Soy extends CondimentDecorator {

	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}

}
