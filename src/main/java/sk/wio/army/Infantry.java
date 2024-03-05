package sk.wio.army;

import sk.wio.commands.*;

public class Infantry extends Soldier implements Defending {
    public Infantry(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + getName() + " here. Type - " + SoldierType.DEFENSIVE);
    }

    @Override
    public void defend() {
        System.out.println("Infantry " + getName() + " deals " + getDamage() + " damage");
    }
}
