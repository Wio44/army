package sk.wio.army;

import sk.wio.commands.*;

public class Artillery extends Soldier implements Attacking, Defending {
    public Artillery(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + getName() + " here. Type - " + SoldierType.ADAPTABLE);
    }

    @Override
    public void attack() {
        System.out.println("Artillery " + getName() + " deals " + getDamage() + " damage");
    }

    @Override
    public void defend() {
        System.out.println("Artillery " + getName() + " deals " + getDamage() + " damage");
    }
}
