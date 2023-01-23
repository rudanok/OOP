package Client;

import Model.Admin;
import Model.User;
import Repository.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void startApp() {
        Persistable user = new UserConsolePersister(new User("Bob"));
        Persistable admin = new AdminConsolePersister(new Admin("John", 78));

        Reportable user1 = new UserConsoleReporter(new User("Thomas"));
        Reportable admin1 = new AdminConsoleReporter(new Admin("Maria", 20));

        List<Persistable> listModel = new ArrayList<>();
        List<Reportable> listModel2 = new ArrayList<>();

        listModel.add(user);
        listModel.add(admin);
        listModel2.add(user1);
        listModel2.add(admin1);

        for (Persistable model : listModel) {
            model.save();
        }
        for (Reportable model : listModel2) {
            model.report();
        }
    }
}