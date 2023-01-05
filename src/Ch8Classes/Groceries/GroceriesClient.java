package Ch8Classes.Groceries;

public class GroceriesClient {
    public static void main(String[] args) {
        GroceryList thanksgivinglist = new GroceryList();

        thanksgivinglist.addItem(new GroceryItemOrder("Cranberry sauce",3,10));
        thanksgivinglist.addItem(new GroceryItemOrder("Stuffing",2,78));
        thanksgivinglist.addItem(new GroceryItemOrder("Turkey",2,0.75));
    }
}
