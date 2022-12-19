public class Cat extends Animal implements Speakable,Runable {

    public Cat(String type, int legs, String owner) {
        super(type, legs, owner);
    }

    @Override
    public String speak() {
        return "Кошка: мяу";
    }

    @Override
    public int runSpeed() {
        return 50;
    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }
}
