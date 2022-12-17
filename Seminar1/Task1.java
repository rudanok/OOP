import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("ОТДЕЛЬНЫЙ ПРОДУКТ:");
        Product water = new Product("Вода", 3);
        System.out.println(water);
        System.out.println();

        System.out.println("ПЕРВЫЙ АППАРАТ:");
        VendingMachine mach1 = new VendingMachine();
        System.out.println(mach1);

        List<Product> productList = new ArrayList<>();
        productList.add(water);
        productList.add(new Product("Творог", 12));
        productList.add(new Product("Молоко", 10));
        productList.add(new Juice("Сок", 19, "виноград"));

        System.out.println("ВТОРОЙ АППАРАТ:");
        VendingMachine mach2 = new VendingMachine(productList);
        System.out.println(mach2);

        System.out.println("ПОИСК ВО ВТОРОМ АППАРАТЕ:");
        System.out.println(mach2.findByName("Сок"));
        System.out.println(mach2.findByPrice(10));
        System.out.println(mach2.findByPriceRange(12, 19));
        System.out.println();

        List<Product> chocoList = new ArrayList<>();

        chocoList.add(new Chocolate("Победа", 16, "молочный", "фисташки"));
        chocoList.add(new Chocolate("Бабаевский", 19, "тёмный", "фундук"));
        chocoList.add(new Chocolate("Москва", 15, "белый", "кешью"));

        System.out.println("ТРЕТИЙ АППАРАТ:");
        VendingMachine mach3Turbo = new VendingMachine(chocoList);
        System.out.println(mach3Turbo);

    }
}