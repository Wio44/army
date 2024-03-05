package sk.wio.army;

import sk.wio.commands.*;

public class SpecialForce extends Soldier implements Attacking {
    public SpecialForce(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + getName() + " here. Type - " + SoldierType.OFFENSIVE);
    }

    @Override
    public void attack() {
        System.out.println("Special Force " + getName() + " deals " + getDamage());
    }
}
