package Ch8Classes.Groceries;

public class GroceryList {
    private static final int MAX_ITEMS = 7;
    private  GroceryItemOrder[] list;
    private int numItems;

    public GroceryList(){
        list = new GroceryItemOrder[MAX_ITEMS];
        numItems = 0;
    }

    public double getTotalCost(){
        double sum = 0.0;
        for (int i = 0; i < list.length;i++){
            sum += list[i].getCost();
        }
        return sum;
    }

    public void addItem(GroceryItemOrder item){
        list[numItems] = item;
        numItems++;
    }

    public String toString(){
        String output = "Your Grocery List:\n\n";
        for (int i = 0;i < list.length;i++) {
            output += list[i] + "\n";
        }
        return output + "\n" + "Total Cost: $" + getTotalCost();
    }
}
