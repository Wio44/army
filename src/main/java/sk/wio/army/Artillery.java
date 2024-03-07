package sk.wio.army;

import sk.wio.*;

public class Artillery extends Soldier {
    public Artillery(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public String toString() {
        return "Artillery " + getName();
    }
}