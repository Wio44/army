package sk.wio.army;

import sk.wio.*;
import sk.wio.commands.*;

public class SpecialForce extends Soldier {
    public SpecialForce(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public String toString() {
        return "Special Force " + getName();
    }
}