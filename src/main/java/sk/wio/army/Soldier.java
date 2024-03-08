package sk.wio.army;

import sk.wio.*;

public abstract class Soldier {
    private final String name;
    private final int damage;
    private final SoldierType type;

    public Soldier(String name, int damage, SoldierType type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public SoldierType getType() {
        return type;
    }

    public void reportSoldier() {
        System.out.println("Soldier " + getName() + " here. Type " + getType());
    }

    @Override
    public String toString() {
        return getName() + " " + name;
    }
}