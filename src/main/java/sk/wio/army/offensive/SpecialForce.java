package sk.wio.army.offensive;

import sk.wio.*;
import sk.wio.army.*;

public class SpecialForce extends Soldier {
    public SpecialForce(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public String toString() {
        return "Special Force " + getName();
    }
}