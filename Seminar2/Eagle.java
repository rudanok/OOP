public class Eagle extends Animal implements Speakable,Runable,Flyable {
    
    public Eagle(String type, int legs, String owner) {
        super(type, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 180;
    }

    @Override
    public int runSpeed() {
        return 1;
    }

    @Override
    public String speak() {
        return "Орёл: крррррр";
    }

    @Override
    public String toString() {
        return "Eagle" + super.toString();
    }
}
