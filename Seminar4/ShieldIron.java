public class ShieldIron extends Shield {

    @Override
    public int protection() {
        return 100;
    }

    @Override
    public String KindOfShield() {
        return "cталь";
    }

    @Override
    public String toString() {
        return "железный щит " +  super.toString();
    }
}
