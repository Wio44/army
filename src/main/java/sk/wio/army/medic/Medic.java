package sk.wio.army.medic;

import sk.wio.*;
import sk.wio.army.*;

public class Medic extends Soldier {
    public Medic(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public String toString() {
        return "Medic " + getName();
    }
}
