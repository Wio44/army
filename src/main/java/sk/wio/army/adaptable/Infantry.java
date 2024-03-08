package sk.wio.army.adaptable;

import sk.wio.*;
import sk.wio.army.*;

public class Infantry extends Soldier {
    public Infantry(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public String toString() {
        return "Infantry " + getName();
    }
}

