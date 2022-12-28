public abstract class WeaponBow implements Weapon {

    public abstract int range();

    @Override
    public String toString() {
        return String.format("(радиус %d, урон %d)", range(), damage());
    }
}
