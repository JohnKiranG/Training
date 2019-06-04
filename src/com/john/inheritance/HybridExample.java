package com.john.inheritance;

public class HybridExample {
	public static void main(String args[]) {
		Crocodile c = new Crocodile();
		c.size();
		c.selfDefence();
		c.eat();
		
		Lizard l=new Lizard();
		l.eyes();
		l.selfDefence();
		l.eat();
	}
}
