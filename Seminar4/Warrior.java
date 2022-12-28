public abstract class Warrior<T extends Weapon, S extends Defense> {
    
    private String name;
    private int healthpoint;
    private T weapon;
    private S defense;

    public Warrior(String name, int healthpoint, T weapon, S defense) {
        this.name = name;
        this.healthpoint = healthpoint;
        this.weapon = weapon;
        this.defense = defense;
    }

    @Override
    public String toString() {
        return String.format("Позывной - %s, Здоровье - %d, Оружие - %s, Защита - %s", name, healthpoint,weapon.toString(), defense.toString());
    }

    public String getName() {
        return name;
    }

    public int getHealthpoint() {
        return healthpoint;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthpoint(int healthpoint) {
        this.healthpoint = healthpoint;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
    public S getDefense() {
        return defense;
    }
    public void setDefense(S defense) {
        this.defense = defense;
    }

}
