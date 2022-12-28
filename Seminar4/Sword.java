public abstract class Sword implements Weapon {

    public abstract int bladeLength();

    @Override
    public String toString() {

        return String.format("(длина %d, урон %d)", bladeLength(), damage());
    }
}
