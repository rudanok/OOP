public class SwordLong extends Sword {

    @Override
    public int bladeLength() {
        return 45;
    }

    @Override
    public int damage() {
        return 30;
    }

    @Override
    public String toString() {
        return "длинный меч " +  super.toString();
    }
}
