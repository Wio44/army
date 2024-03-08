package sk.wio.army.offensive;

import sk.wio.*;
import sk.wio.army.*;

public class Commando extends Soldier {
    public Commando(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public String toString() {
        return "Commando " + getName();
    }
}
