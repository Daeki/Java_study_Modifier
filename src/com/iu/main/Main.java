package com.iu.main;

import com.iu.terran.Marine;
import com.iu.unit.Unit;

public class Main {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		m1.setHp(30);
		m1.info();
		m1.move();
	}

}
