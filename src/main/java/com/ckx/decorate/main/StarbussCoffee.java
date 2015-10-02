package com.ckx.decorate.main;

import com.ckx.decorate.basic.Beverage;
import com.ckx.decorate.condiment.Mocha;
import com.ckx.decorate.condiment.Soy;
import com.ckx.decorate.condiment.Whip;
import com.ckx.decorate.drinks.DarkRoast;
import com.ckx.decorate.drinks.Espresso;
import com.ckx.decorate.drinks.HouseBlend;

public class StarbussCoffee {
	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " $" + espresso.cost());
		
		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());
		
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
	}
}
