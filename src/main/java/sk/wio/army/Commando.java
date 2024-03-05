package sk.wio.army;

import sk.wio.commands.*;

public class Commando extends Soldier implements Attacking {
    public Commando(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + getName() + " here. Type - " + SoldierType.OFFENSIVE);
    }

    @Override
    public void attack() {
        System.out.println("Commando " + getName() + " deals " + getDamage() + " damage");
    }
}
