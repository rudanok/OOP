import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class VendingMachine {
    
    private List<Product> productList;

    private static List<Product> DEFAULT = new ArrayList<>(Arrays.asList(new Product("Пакет", 1)));

    public VendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    public VendingMachine() {
        this(DEFAULT); // вызов конструктора
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        productList.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }

    public List<Product> findByName(String name) {
        return finder(p->p.getName().equals(name));
    }

    public List<Product> findByPrice(double price) {
        return finder(p->p.getPrice()==price);
    }

    public List<Product> findByPriceRange(double p1, double p2) {
        return finder(p -> p.getPrice() >= p1 && p.getPrice() <= p2);
    }

    private List<Product> finder(Function<Product, Boolean> f) {

        List<Product> result = new ArrayList<>();
        productList.forEach(i -> {
            if (Boolean.TRUE.equals(f.apply(i)))
                result.add(i);
        });
        return result;
    }

}