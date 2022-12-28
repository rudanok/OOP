public abstract class Shield implements Defense {

    public abstract String KindOfShield();

    @Override
    public String toString() {
        return String.format("(%s, уровень %d)", KindOfShield(), protection());
    }
}
