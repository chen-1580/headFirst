package com.ckx.strategy.person;

import com.ckx.strategy.behavior.AxeBehavior;
import com.ckx.strategy.character.Character;


public class Knight extends Character {

	public void fight() {
		setWeapon(new AxeBehavior());
	}

}
