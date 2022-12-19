public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Млекопитающие",4,"Oleg"))
                .addAnimal(new Dog("Млекопитающие",4,"Petya"))
                .addAnimal(new Duck("Птицы",2,"Ivan"))
                .addAnimal(new Eagle("Птицы",2,"Sasha"))
                .addAnimal(new Crocodile("Рептилии",2,"Antarktida"))
                .addAnimal(new Elephant("Млекопитающие",4,"Africa"));
        System.out.println(zoo.toString());

        System.out.println();
        System.out.println("Звуки животных:");
        System.out.println(zoo.talk());

        System.out.println("Скорост бега:");
        for (Runable i: zoo.getRunable()) {
            System.out.println(i.toString()+" -- " + i.runSpeed()+" км/ч");
        }
        System.out.println("Скорость чемпиона -- " + zoo.getChampionSpeed());

        System.out.println();
        System.out.println("Скорости полёта: ");
        for (Flyable i: zoo.getFlyable()) {
            System.out.println(i.toString() +" -- "+ i.flySpeed()+" км/ч");
        }

        System.out.println();
        System.out.println("Скорость плавания: ");
        for (Swimable i: zoo.getSwimable()) {
            System.out.println(i.toString()+" -- "+i.swimSpeed()+" км/ч");
        }
        SaveManagerAnimals saveManagerAnimals = new SaveManagerAnimals();
        saveManagerAnimals.save(zoo.getAnimals());

    }
}