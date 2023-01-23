package views;

import java.util.List;
import java.util.Scanner;

import controllers.UserController;
import model.User;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду: ");
            com = Commands.valueOf(command.toUpperCase());
            if (com == Commands.EXIT) return;
            try {
                switch (com) {
                    case CREATE:
                        userController.saveUser(createAGuy());
                        break;
                    case READ:
                        String id = prompt("ID пользователя: ");
                        User user = userController.readUser(id);
                        System.out.println(user);
                        break;
                    case LIST:
                        List<User> lst = userController.readList();
                        lst.forEach(i -> System.out.println(i + "\n"));
                        break;
                    case UPDATE:
                        String numId = prompt("Какой контакт редактировать? Введите ID: ");
                        userController.idPresenceValidation(numId);
                        userController.updateUser(numId, createAGuy());
                        break;
                    case DELETE:
                        String delID = prompt("Какой контакт удалить? Введите ID: ");
                        userController.idPresenceValidation(delID);
                        userController.deleteUser(delID);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Oops!\n"+ e.getMessage()); ;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User createAGuy() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Телефон: ");
        User newGuy = new User(firstName, lastName, phone);
        return newGuy;
    }
}