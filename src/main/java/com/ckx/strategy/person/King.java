package com.ckx.strategy.person;

import com.ckx.strategy.behavior.SwordBehavior;
import com.ckx.strategy.character.Character;

public class King extends Character{

	public void fight() {
		setWeapon(new SwordBehavior());
	}

}
