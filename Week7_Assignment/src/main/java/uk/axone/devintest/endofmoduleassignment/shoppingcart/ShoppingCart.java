package uk.axone.devintest.endofmoduleassignment.shoppingcart;

import uk.axone.devintest.endofmoduleassignment.exception.InvalidDataException;
import uk.axone.devintest.endofmoduleassignment.exception.ItemNotFoundException;
import uk.axone.devintest.endofmoduleassignment.exception.ItemOutOfStockException;
import uk.axone.devintest.endofmoduleassignment.exception.ItemNotInCartException;
import uk.axone.devintest.endofmoduleassignment.model.Item;

import java.util.ArrayList;

public class ShoppingCart extends Inventory{

    public ArrayList<Item> cartItems = new ArrayList<>();

    public ShoppingCart() throws InvalidDataException {
        new Inventory();
    }

    /**
     * Adds a single item to the cart, checking if the Item is valid and in stock
     *
     * @param it - Item object
     * @return true if added successfully
     * @throws ItemNotFoundException
     * @throws ItemOutOfStockException
     */
    public boolean addToCart(Item it) throws ItemNotFoundException, ItemOutOfStockException {
        if(validateItem(it) && stock.containsKey(it)){
            cartItems.add(it);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adds multiple items to cart, checking if the Item is valid and in stock
     *
     * @param it - Item object
     * @return true if added successfully
     * @throws ItemNotFoundException
     * @throws ItemOutOfStockException
     */
    public boolean addToCart(Item it, int quantity) throws ItemNotFoundException, ItemOutOfStockException {
        return true;
    }

    /**
     * Removes a single item from the cart
     *
     * @param it - Item object
     * @return true if removed successfully
     * @throws ItemNotInCartException
     */
    public boolean removeFromCart(Item it) throws ItemNotInCartException {
        System.out.println("cartItems.size()" + cartItems.size());
        for (int i = 0; i < cartItems.size(); ++i) {
            System.out.println("cartItems.get(i).getItemName()" + cartItems.get(i).getItemName());
            if(it.getItemName().equals(cartItems.get(i).getItemName())){
                cartItems.remove(i);
                return true;
            } else {
                throw new ItemNotInCartException("Item not in cart");
            }
        }
        return false;
    }

    /**
     * Returns the total cost of items in the cart at any point
     *
     * @return true if removed successfully
     */
    public long calculateTotalCost() {
        long totalCost = 0;
        for (int i = 0; i < cartItems.size(); ++i) {
            totalCost = (long) cartItems.get(i).getPrice();
        }
        return totalCost;
    }

    /**
     * Returns the items in the cart as an array
     *
     * @return items
     */
   /* public Items[] getCartContents() {
        return ;
    }*/
    /**
     * Returns the items in the cart as an array
     *
     * @return items
     */
    void checkout() {

    }
}
