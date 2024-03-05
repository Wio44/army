package sk.wio.army;

import sk.wio.commands.*;

public class Medic extends Soldier implements Healthcare {
    public Medic(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + getName() + " here. Type - " + SoldierType.DEFENSIVE);
    }

    @Override
    public void recoverHealth() {
        System.out.println("Medic " + getName() + " provide health care");
    }
}
