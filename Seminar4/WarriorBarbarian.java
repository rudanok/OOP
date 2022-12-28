public class WarriorBarbarian extends Warrior<WeaponAxe, Shield> {

    public WarriorBarbarian(String name, int healthpoint, WeaponAxe weapon, Shield defense) {
        super(name, healthpoint, weapon, defense);
    }

    @Override
    public String toString() {
        return "ВАРВАР. " + super.toString();
    }
}
