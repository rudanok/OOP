public class WarriorKnight extends Warrior<Sword, Shield> {

    public WarriorKnight(String name, int healthpoint, Sword weapon, Shield defense) {
        super(name, healthpoint, weapon, defense);
    }

    @Override
    public String toString() {
        return "РЫЦАРЬ. " + super.toString();
    }
}
