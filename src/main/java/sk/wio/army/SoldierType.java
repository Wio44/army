package sk.wio.army;

public enum SoldierType {
    OFFENSIVE("Offensive"),
    DEFENSIVE("Defensive"),
    ADAPTABLE("Adaptable");

    private final String description;

    SoldierType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
