package uk.axone.shoppingcart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.axone.devintest.endofmoduleassignment.exception.ItemNotFoundException;
import uk.axone.devintest.endofmoduleassignment.exception.ItemOutOfStockException;
import uk.axone.devintest.endofmoduleassignment.model.Item;
import uk.axone.devintest.endofmoduleassignment.shoppingcart.ShoppingCart;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test ShoppingCart class
 */
class TestShoppingCart {

    ShoppingCart shoppingCart;

    @BeforeEach
    public void init()
    {
        shoppingCart = new ShoppingCart();
    }

    /**
     * Add valid in-stock items to cart and check if the price is calculated properly
     * @throws ItemOutOfStockException
     * @throws ItemNotFoundException
     */
    @Test
    void addToCartValidItemAndCalculatePrice() throws ItemOutOfStockException, ItemNotFoundException {
        Item addItem = new Item(1001, "IPhone 12", "A great all around phone from Apple", 100.0);
        Item addItem1 = new Item(1002,"Samsung S10","Samsung galaxy flagship",95.5);
        assertTrue(shoppingCart.addToCart(addItem,10));//10*100.0 = 1000
        assertTrue(shoppingCart.addToCart(addItem1,2));//2*95.2=191
        //1000+191 = 1191
        assertEquals(1191, shoppingCart.calculateTotalCost());
    }

    /**
     * Add items and perform a checkout and ensure the stock levels are reduced.
     * @throws ItemOutOfStockException
     * @throws ItemNotFoundException
     */
    @Test
    void testCheckout() throws ItemOutOfStockException, ItemNotFoundException {

        Item addItem = new Item(1001, "IPhone 12", "A great all around phone from Apple", 100.0);
        Item addItem1 = new Item(1002,"Samsung S10","Samsung galaxy flagship",95.5);
        shoppingCart.addToCart(addItem,1);//10*100.0 = 1000
        shoppingCart.addToCart(addItem1,2);//2*95.2=191

        //Get the number of item in Invenotry stock
        assertEquals(20, shoppingCart.getNumOfItemInStock(addItem));
        assertEquals(40, shoppingCart.getNumOfItemInStock(addItem1));
        //Call the checkout method
        shoppingCart.checkout();
        //Valid the item got reduced from Inventory Stock
        assertEquals(19, shoppingCart.getNumOfItemInStock(addItem));
        assertEquals(38, shoppingCart.getNumOfItemInStock(addItem1));

    }

    /**
     * Try to add an invalid item and ensure appropriate exception is generated
     */
    @Test
    void addToCartInvalidItem() {
        //Test invalid item
        Item addItem = new Item(111, "IPhone 12", "A great all around phone from Apple", 100.0);
        assertThrows(ItemNotFoundException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                shoppingCart.addToCart(addItem);
            }
        });

    }

    /**
     * Try to add an item not in stock and ensure appropriate exception is generated
     * @throws ItemOutOfStockException
     * @throws ItemNotFoundException
     */
    @Test
    void addToCartItemNotInStock() throws ItemOutOfStockException, ItemNotFoundException {

        //Out of Stock check
        Item addItem = new Item(1001, "IPhone 12", "A great all around phone from Apple", 100.0);
        assertThrows(ItemOutOfStockException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                shoppingCart.addToCart(addItem,400);
            }
        });
    }

}
