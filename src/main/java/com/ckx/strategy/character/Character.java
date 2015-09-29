package com.ckx.strategy.character;

import com.ckx.strategy.behavior.WeaponBehavior;

public abstract class Character {

	WeaponBehavior weapon;
	
	public abstract void fight();

	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	
}
