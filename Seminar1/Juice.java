public class Juice extends Product {

    private String flavor;

    public Juice(String name, double price, String flavor) {
        super(name, price);
        this.setFlavor(flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    private void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String toString(){
        return String.format("%s, %s", super.toString(), flavor);
    }

}
