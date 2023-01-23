package Repository;

import Model.UserModel;

public class UserConsoleReporter implements Reportable {
    private UserModel usermodel;

    public UserConsoleReporter(UserModel userModel) {
        this.usermodel = userModel;
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + usermodel.getName());

    }
}