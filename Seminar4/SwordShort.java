public class SwordShort extends Sword {

    @Override
    public int bladeLength() {
        return 15;
    }

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public String toString() {
        return "короткий меч " + super.toString();
    }
}
