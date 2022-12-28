public class ShieldWood extends Shield{
    @Override
    public int protection() {
        return 10;
    }

    @Override
    public String KindOfShield() {
        return "дерево";
    }

    @Override
    public String toString() {
        return "деревянный щит " + super.toString();
    }
}
