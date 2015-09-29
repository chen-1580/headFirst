package com.ckx.strategy.person;

import com.ckx.strategy.behavior.KnifeBehavior;
import com.ckx.strategy.character.Character;

public class Troll extends Character{

	public void fight() {
		setWeapon(new KnifeBehavior());
	}

}
