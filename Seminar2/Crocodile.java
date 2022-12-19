public class Crocodile extends Animal implements Swimable, Runable {

    public Crocodile(String type, int legs, String owner) {
        super(type, legs, owner);
    }

    @Override
    public String toString() {
        return "Crocodile" + super.toString();
    }

    @Override
    public int runSpeed() {
        return 15;
    }

    @Override
    public int swimSpeed() {
        return 30;
    }
}
