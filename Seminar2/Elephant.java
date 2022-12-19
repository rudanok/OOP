public class Elephant extends Animal implements Runable, Swimable, Speakable{

    public Elephant(String type, int legs, String owner) {
        super(type, legs, owner);
    }

    @Override
    public String toString() {
        return "Elephant" + super.toString();
    }

    @Override
    public int runSpeed() {
        return 24;
    }

    @Override
    public String speak() {
        return "Слон: ууууу";
    }

    @Override
    public int swimSpeed() {
        return 7;
    }
}
