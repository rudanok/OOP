public class Duck extends Animal implements Speakable,Runable,Flyable {

    public Duck(String type, int legs, String owner) {
        super(type, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 40;
    }

    @Override
    public int runSpeed() {
        return 5;
    }

    @Override
    public String speak() {
        return "Утка: кря";
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }
}
