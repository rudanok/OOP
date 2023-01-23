package Model;

public class User extends UserModel {
    private String name;

    public User(String name) {
        this.name = name;
        this.number = 0;
    }

    public User(String name, int number) {
        this(name);
        this.number = number;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getComment() {
        return "comment";
    }

    @Override
    public String getNumber() {
        return String.format("number = %d", number);
    }
}
