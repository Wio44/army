package sk.wio;

public enum SoldierType {
    OFFENSIVE("Offensive"),
    DEFENSIVE("Defensive"),
    ADAPTABLE("Adaptable"),
    MEDIC("Medic");

    private final String description;

    SoldierType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
