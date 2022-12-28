public class WarriorComandor extends Warrior<Weapon, Defense> {

    public WarriorComandor(String name, int healthpoint, Weapon weapon, Shield defense) {
        super(name, healthpoint, weapon, defense);
    }

    @Override
    public String toString() {
        return "КОМАНДИР. " + super.toString();
    }
}
