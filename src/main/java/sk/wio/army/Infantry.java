package sk.wio.army;

import sk.wio.*;
import sk.wio.commands.*;

public class Infantry extends Soldier {
    public Infantry(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public String toString() {
        return "Infantry " + getName();
    }
}

