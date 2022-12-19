public  class Animal {

    private String type;
    private int legs;
    private String owner;

    public String getType() {
        return type;
    }

    public int getLegs() {
        return legs;
    }

    public String getOwner() {
        return owner;
    }

    public Animal(String type, int legs, String owner) {
        this.type = type;
        this.legs = legs;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "{" +
                "type = '" + type + '\'' +
                ", legs=" + legs +
                ", owner=" + owner +
                '}';
    }
}

