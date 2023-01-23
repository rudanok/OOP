package Client;

import Model.User;
import Repository.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void startApp() {
        Persistable user1 = new UserConsolePersister(new User("Alex"));
        Persistable user2 = new UserConsolePersister(new User("Ivan", 1));
        Reportable user3 = new UserConsoleReporter(new User("Oleg", 1));

        List<Persistable> listModel1 = new ArrayList<>();
        List<Reportable> listModel2 = new ArrayList<>();

        listModel1.add(user1);
        listModel1.add(user2);
        listModel2.add(user3);

        for (Persistable model : listModel1) {
            model.save();
        }
        for (Reportable model : listModel2) {
            model.report();
        }
    }
}