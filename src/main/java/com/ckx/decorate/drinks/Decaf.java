package com.ckx.decorate.drinks;

import com.ckx.decorate.basic.Beverage;

/**
 * �Ϳ�����
 * @author Apache
 *
 */
public class Decaf extends Beverage {

	public Decaf () {
		description = "Decaf";
	}
	
	public double cost() {
		return 1.05;
	}

}
