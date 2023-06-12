package uk.axone.devintest.endofmoduleassignment.shoppingcart;

import org.slf4j.LoggerFactory;
import uk.axone.devintest.endofmoduleassignment.exception.InvalidDataException;
import uk.axone.devintest.endofmoduleassignment.exception.ItemNotFoundException;
import uk.axone.devintest.endofmoduleassignment.exception.ItemOutOfStockException;
import uk.axone.devintest.endofmoduleassignment.exception.ItemNotInCartException;
import uk.axone.devintest.endofmoduleassignment.model.Item;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart{

    // logger to log message
    Logger logger = LoggerFactory.getLogger(ShoppingCart.class.getName());
    // empty cart
    Map<Item, Integer> cartItem = new HashMap<>();
    // inventory
    Inventory inventory;

    /**
     * Adds a single item to the cart, checking if the Item is valid and in stock
     *
     * @param it - Item object
     * @return true if added successfully
     * @throws ItemNotFoundException
     * @throws ItemOutOfStockException
     */
    public boolean addToCart(Item it) throws ItemNotFoundException, ItemOutOfStockException {

        if (inventory.validateItem(it)) {
            if(getNumOfItemInStock(it) >= 1) {
                logger.info("Item present in Inventory");
                cartItem.put(it, 1);
                logger.info("Added Item to cart");
                return true;
            }else{
                throw new ItemOutOfStockException("Out of Stock!!!");
            }
        }else{
            throw new ItemNotFoundException("Item Not found!!!");
        }
    }

    /**
     *
     * @param it( Item object)
     * @return Number of Item in Inventory Stock
     * @throws ItemNotFoundException
     */
    public int getNumOfItemInStock(Item it) throws ItemNotFoundException {
        return  inventory.getItemStock(it);
    }

    /**
     * Add given Item and Quantity to Cart
     * @param it
     * @param quantity
     * @return Successful if it is valid item and item request within Inventory stock
     * @throws ItemNotFoundException - if Item given is invalid
     * @throws ItemOutOfStockException - if Requested quantity more than Stock Inventory
     */
    public boolean addToCart(Item it, int quantity) throws  ItemNotFoundException, ItemOutOfStockException {
        if (inventory.validateItem(it)) {
            if(getNumOfItemInStock(it) >= quantity) {
                logger.info("Item present in Inventory");
                cartItem.put(it, quantity);
                logger.info("Added Item to cart");
                return true;
            }else{
                throw new ItemOutOfStockException("Out of Stock!!!");
            }
        }else{
            throw new ItemNotFoundException("Item Not found!!!");
        }
    }

    /**
     * Removes the Item added to cart
     * @param it
     * @return True If Item removed from cart
     * @throws ItemNotInCartException - If Item given not exist in cart
     */
    boolean removeFromCart(Item it) throws ItemNotInCartException {
        if(cartItem.containsKey(it)){
            cartItem.remove(it);
            return true;
        }else{
            throw new ItemNotInCartException("Item not found in cart!!");
        }
    }
    /**
     * Calculate the price for Items in Cart
     * @return Total cost
     */
    public Double calculateTotalCost(){
        Double totalCost=0.0;
        for(Map.Entry<Item, Integer> cartItem: cartItem.entrySet()){
            Item tempItem = cartItem.getKey();
            int qty= cartItem.getValue();
            totalCost = totalCost + (tempItem.getPrice()*qty);
        }
        logger.info("Total cost: "+totalCost);
        return totalCost;
    }
    /**
     * List of Item in Cart
     * @return List of Item in cart
     */
    Item[] getCartContents(){
        Item[] cartItems = new Item[cartItem.size()+1];
        int i =0;
        for(Map.Entry<Item, Integer> cartItem: cartItem.entrySet()) {
            cartItems[i++] = cartItem.getKey();
        }
        return cartItems;
    }

    /**
     * Checkout the Cart item and reduce the Item inventory stock
     * @throws ItemNotFoundException - If item not present
     */
    public void checkout() throws ItemNotFoundException {
        for (Map.Entry<Item,Integer> checkoutItem: cartItem.entrySet()) {
            if(inventory.validateItem(checkoutItem.getKey())){
                inventory.reduceStock(checkoutItem.getKey(), checkoutItem.getValue());
            }
        }
        cartItem.clear();
    }

    /**
     * validate your code
     * @param args
     * @throws InvalidDataException
     * @throws ItemNotFoundException
     * @throws ItemOutOfStockException
     * @throws ItemNotInCartException
     */
    public static void main(String[] args) throws InvalidDataException, ItemNotFoundException, ItemOutOfStockException, ItemNotInCartException {
        new ShoppingCart().run();
    }

    /**
     * helps to add items, remove and checkout
     * @throws ItemOutOfStockException
     * @throws ItemNotFoundException
     * @throws ItemNotInCartException
     */
    public void run() throws ItemOutOfStockException, ItemNotFoundException, ItemNotInCartException {

        Item addItem = new Item(1001, "IPhone 12", "A great all around phone from Apple", 100.0);
        boolean result = addToCart(addItem);
        if(result)
            logger.info("Item added to cart successfully");

        result = addToCart(addItem,10);
        if(result)
            logger.info("Item aded to cart with quantity given");

        Double costOfItemInCart =calculateTotalCost();

        Item[] cartItemArray = getCartContents();
        for (int i =0; i< cartItemArray.length-1; i++){
            logger.info("Cart item: "+ cartItemArray[i]);
        }
        result = removeFromCart(addItem);
        if(result)
            logger.info("Removed the Item from Cart");

    }

}
