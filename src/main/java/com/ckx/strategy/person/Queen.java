package com.ckx.strategy.person;

import com.ckx.strategy.behavior.BowAndArrowBehavior;
import com.ckx.strategy.character.Character;

public class Queen extends Character{

	public void fight() {
		setWeapon(new BowAndArrowBehavior());
	}

	
}
