package com.ckx.decorate.drinks;

import com.ckx.decorate.basic.Beverage;

/**
 * вш╨о
 * @author Apache
 *
 */
public class HouseBlend extends Beverage {

	public HouseBlend () {
		description = "House Blend Coffee";
	}
	
	public double cost() {
		return .89;
	}

}
