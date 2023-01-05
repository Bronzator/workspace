package Ch8Classes.Groceries;

/**
 * This class stores information on the items on the Grocery List
 * Friday, November 18, 2022
 */
public class GroceryItemOrder {
    //fields
    private String name;
    private int quantity;
    private double ppu;
    //constrocturs

    public GroceryItemOrder(String name, int quantity, double ppu) {
        this.name = name;
        this.quantity = quantity;
        this.ppu = ppu;
    }

    //getters
    public double getCost(){
        return quantity * ppu;
    }
    //setters
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    //toString
    public String toString(){
        return  quantity + "\t\t" + name + "\t\t" + ppu;
    }
}
