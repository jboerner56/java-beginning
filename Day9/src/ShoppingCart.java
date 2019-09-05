
public class ShoppingCart{
    int itemCount; // total number of items
    double totalPrice; // total price for all items
    int capicity; // current size of cart
    Item[] cart; // array to store actual items in
    public ShoppingCart() {
        // initialize variables
        itemCount = 0;
        totalPrice = 0;
        capicity = 10;
        cart = new Item[capicity];
    }
    // function to add items to the cart
    public void addToCart(String itemName, double price, int quantity) {
        // add new item to cart with name, price and quantity
        // [itemCount++] will add one to the capicity for each new item added
        cart[itemCount++] = new Item(itemName, price, quantity);
        totalPrice += price * quantity;
        // will increase capicity if item count hits first given size
//        if(itemCount == capicity)
//            increaseSize();
    }
    // need to build out increasesize function
//    private void increaseSize() {
//
//    }


}
