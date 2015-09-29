package com.ckx.strategy.main;

import com.ckx.strategy.character.Character;
import com.ckx.strategy.person.King;
import com.ckx.strategy.person.Knight;
import com.ckx.strategy.person.Queen;
import com.ckx.strategy.person.Troll;

public class Fight {
	public static void main(String[] args) {
		Character king = new King();
		Character knight = new Knight();
		Character queen = new Queen();
		Character troll = new Troll();
		king.fight();
		knight.fight();
		queen.fight();
		troll.fight();
	}
}
