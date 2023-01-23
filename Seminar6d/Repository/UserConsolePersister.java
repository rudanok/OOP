package Repository;


import Model.UserModel;

public class UserConsolePersister implements Persistable {

    private UserModel userModel;

    public UserConsolePersister(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    public void save() {
        System.out.println("Save user: " + userModel.getName() + ", " + userModel.getNumber() + ", " + userModel.getComment());
    }
}
