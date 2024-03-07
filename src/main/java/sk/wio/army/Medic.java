package sk.wio.army;

import sk.wio.*;
import sk.wio.commands.*;

public class Medic extends Soldier {
    public Medic(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public String toString() {
        return "Medic " + getName();
    }
}
