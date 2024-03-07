package sk.wio.army;

import sk.wio.*;
import sk.wio.commands.*;

public class Commando extends Soldier {
    public Commando(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public String toString() {
        return "Commando " + getName();
    }
}
