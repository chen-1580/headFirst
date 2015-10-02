package com.ckx.decorate.drinks;

import com.ckx.decorate.basic.Beverage;

/**
 * �����
 * @author Apache
 *
 */
public class DarkRoast extends Beverage {

	public DarkRoast () {
		description = "Dark Roast Coffee";
	}
	
	public double cost() {
		return .99;
	}

}
