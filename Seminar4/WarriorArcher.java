public class WarriorArcher extends Warrior<WeaponBow, Shield> {

    public WarriorArcher(String name, int healthpoint, WeaponBow weapon, Shield defense) {
        super(name, healthpoint, weapon, defense);
    }

    @Override
    public String toString() {
        return "ЛУЧНИК. " + super.toString();
    }
}
