package com.ckx.decorate.drinks;

import com.ckx.decorate.basic.Beverage;

/**
 * Å¨Ëõ
 * @author Apache
 *
 */
public class Espresso extends Beverage {

	public Espresso () {
		description = "Espresso";
	}
	
	public double cost() {
		return 1.99;
	}

}
