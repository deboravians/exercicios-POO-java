public class Slot {
    private String name;
    private float price;
    private int quantity;

    public Slot(String name, float price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return String.format("%8s",this.name) + " : " +
                this.quantity + " U : " +
                Main.decForm.format(this.price) + " RS";
    }
}
