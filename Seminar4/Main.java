public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------");
        System.out.println("Команда лучников");
        WarriorComandor comandor = new WarriorComandor("Arch", 100, new SwordLong(), new ShieldIron());
        Team<WarriorArcher> archerTeam = new Team<>(comandor);
        System.out.println(comandor);
        archerTeam.addWarriors(new WarriorArcher("A1", 79, new WeaponLongBow(), new ShieldWood()));
        archerTeam.addWarriors(new WarriorArcher("A2", 48, new WeaponLongBow(), new ShieldWood()));
        archerTeam.addWarriors(new WarriorArcher("A3", 39, new WeaponLongBow(), new ShieldIron()));
        archerTeam.forEach(System.out::println);
        System.out.println("Суммарный урон " + archerTeam.getAllDamage() + 
                           ", Суммарное здоровье "+ " " + archerTeam.getAllHealthPoint() + 
                           ", Зона поражение " + archerTeam.getMaxRadius() + 
                           ", Минимальная защита " + archerTeam.minProtected());
        
        System.out.println("------------------------");
        System.out.println("Команда варваров");
        WarriorComandor comandor2 = new WarriorComandor("Bar", 200, new WeaponLongBow(), new ShieldIron());
        Team<WarriorBarbarian> axes = new Team<>(comandor2);
        axes.addWarriors(new WarriorBarbarian("B1", 32, new WeaponSekira(), new ShieldLeather()));
        System.out.println(comandor2);
        for (WarriorBarbarian item: axes) {
            System.out.println(item);
        }
        System.out.println("Суммарный урон " + axes.getAllDamage() +
                ", Суммарное здоровье " + axes.getAllHealthPoint() +
                ", Зона поражение " + axes.getMaxRadius() + " " +
                ", Минимальная защита " + axes.minProtected());

        System.out.println("----------------------");
        System.out.println("Сводная команда");
        WarriorComandor comandor3 = new WarriorComandor("Sam", 200, new SwordLong(), new ShieldIron());
        Team<Warrior> warriorTeam = new Team<>(comandor3);
        warriorTeam.addWarriors(new WarriorBarbarian("S1", 54, new WeaponSekira(), new ShieldLeather()));
        warriorTeam.addWarriors(new WarriorArcher("S2", 66, new WeaponLongBow(), new ShieldWood()));
        warriorTeam.addWarriors(new WarriorKnight("S3", 75, new SwordLong(), new ShieldIron()));
        warriorTeam.addWarriors(new WarriorKnight("S4", 77, new SwordShort(), new ShieldIron()));
        System.out.println(comandor3);
        warriorTeam.forEach(System.out::println);
        System.out.println("Суммарный урон " + warriorTeam.getAllDamage() + 
                         ", Суммарное здоровье " + warriorTeam.getAllHealthPoint() + 
                         ", Зона поражение макс " + warriorTeam.getMaxRadius() + 
                         ", Минимальная защита " + warriorTeam.minProtected());
    }
}