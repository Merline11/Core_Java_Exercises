package uk.axone.devintest.endofmoduleassignment.shoppingcart;

import uk.axone.devintest.endofmoduleassignment.exception.InvalidDataException;
import uk.axone.devintest.endofmoduleassignment.exception.ItemNotFoundException;
import uk.axone.devintest.endofmoduleassignment.exception.ItemNotInCartException;
import uk.axone.devintest.endofmoduleassignment.model.Item;

import java.util.Map;

public class DemoFromExcelFile {

    public static void main(String[] args) throws InvalidDataException, ItemNotFoundException, ItemNotInCartException {

        InventoryFromExcelFile inventory = new InventoryFromExcelFile();
        for(Item item: inventory.stock.keySet()){
            System.out.println(item.getItemCode() +" "+item.getItemName() +" "+item.getItemDescription() + " " +item.getPrice());
        }
        System.out.println("--------------------------------------");
        for(Map.Entry<Item, Integer> itemMap: inventory.stock.entrySet()){
            System.out.println(itemMap.getKey() + " " + itemMap.getValue());
            System.out.println("--------------------------------------");
        }

        System.out.println("-------------------------------getItemInStock-----------------------------------------");
        for(Item item: inventory.stock.keySet()){
            System.out.println(inventory.getItemStock(item));
        }

        System.out.println("-------------------------------reduceStock-----------------------------------------");
        for(Item item: inventory.stock.keySet()){
            System.out.println(inventory.reduceStock(item,21));
            break; // concurrentmodificationexception
        }
        System.out.println("-------------------------------getItemInStock-----------------------------------------");
        for(Item item: inventory.stock.keySet()){
            System.out.println(inventory.getItemStock(item));
        }


        ShoppingCart shoppingCart = new ShoppingCart();
        //shoppingCart.addToCart(new Item(1003));
        System.out.println("-------------------------------removeStock-----------------------------------------");
        for(Item item: inventory.stock.keySet()){
            System.out.println(shoppingCart.removeFromCart(item));
            break; // concurrentmodificationexception
        }


    }
}
