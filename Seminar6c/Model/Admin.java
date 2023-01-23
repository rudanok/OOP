package Model;

public class Admin extends AdminModel {
    String name;

    public Admin(String name) {
        this.name = name;
        this.skills = 1;
    }

    public Admin(String name, int skills) {
        this(name);
        this.skills = skills;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return "admin description";
    }

    @Override
    public String getSkills() {
        return String.format("skills = %d", skills);
    }
}
