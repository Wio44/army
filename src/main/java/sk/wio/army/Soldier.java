package sk.wio.army;

public abstract class Soldier {
    private final String name;
    private final int damage;
    private SoldierType type;

    public Soldier(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public abstract void report();
}
