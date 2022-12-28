public class WeaponSekira extends WeaponAxe {

    @Override
    public int damage() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format("секира (урон %d)", damage());
    }
}
