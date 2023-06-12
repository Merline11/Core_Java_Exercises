package uk.axone.devintest.endofmoduleassignment.shoppingcart;

import uk.axone.devintest.endofmoduleassignment.exception.InvalidDataException;
import uk.axone.devintest.endofmoduleassignment.exception.ItemNotFoundException;
import uk.axone.devintest.endofmoduleassignment.model.Item;

public class DemoFromCSVFile {

    public static void main(String[] args) throws InvalidDataException, ItemNotFoundException {
        Inventory inventory = Inventory.getInstance();
        System.out.println("Retrieving File values");
        for(Item item: inventory.stock.keySet()){
            System.out.println(item.getItemCode() +" "+item.getItemName() +" "+item.getItemDescription() + " " +item.getPrice()+ " "+inventory.stock.get(item));
        }
        System.out.println("-----------------------------Reduce Stock------------------------------");
        for(Item item: inventory.stock.keySet()) {
            System.out.println(inventory.reduceStock(item, 3));
            break;
        }
        for(Item item: inventory.stock.keySet()){
            System.out.println(item.getItemCode() +" "+item.getItemName() +" "+item.getItemDescription() + " " +item.getPrice()+ " "+inventory.stock.get(item));
        }
        System.out.println("-----------------------------getItemStock------------------------------");
        for(Item item: inventory.stock.keySet()){
            System.out.println(inventory.getItemStock(item));
        }
    }
}
