public class WeaponLongBow extends WeaponBow {

    @Override
    public int range() {
        return 100;
    }

    @Override
    public int damage() {
        return 15;
    }

    @Override
    public String toString() {
        return "большой лук " + super.toString();
    }
}
