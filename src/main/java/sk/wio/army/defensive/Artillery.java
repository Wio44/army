package sk.wio.army.defensive;

import sk.wio.*;
import sk.wio.army.*;

public class Artillery extends Soldier {
    public Artillery(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public String toString() {
        return "Artillery " + getName();
    }
}