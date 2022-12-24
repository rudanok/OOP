import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> NumberList = new LinkedList<>();
        NumberList.addLast("Второй");
        NumberList.addFirst("Первый");
        NumberList.addLast("Третий");
        NumberList.addFirst("Нулевой");

        System.out.println("--------------------------");
        for (String item: NumberList) {
            System.out.println(item);
        }

        System.out.println("--------------------------");
        System.out.println("Количество элементов в списке: " + NumberList.size());
        System.out.println("Получение элемента по индексу: " + NumberList.getItemByIndex(1));
    }
}