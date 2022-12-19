public class Dog extends Animal implements Speakable,Runable {

    public Dog(String type, int legs, String owner) {
        super(type, legs, owner);
    }

    @Override
    public String speak() {
        return "Собака: гав";
    }


    @Override
    public int runSpeed() {
        return 30;
    }

    @Override
    public String toString() {
        return "Dog" + super.toString();
    }
}
