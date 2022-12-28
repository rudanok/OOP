public class ShieldLeather extends Shield {

    @Override
    public int protection() {
        return 30;
    }

    @Override
    public String KindOfShield() {
        return "кожа";
    }

    @Override
    public String toString() {
        return "кожаный щит "  + super.toString();
    }
}
