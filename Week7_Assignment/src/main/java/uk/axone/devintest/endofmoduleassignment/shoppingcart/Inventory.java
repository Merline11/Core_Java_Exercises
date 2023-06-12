package uk.axone.devintest.endofmoduleassignment.shoppingcart;

import uk.axone.devintest.endofmoduleassignment.exception.InvalidDataException;
import uk.axone.devintest.endofmoduleassignment.exception.ItemNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.axone.devintest.endofmoduleassignment.model.Item;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * holds Inventory from csv file
 */
public class Inventory {
    Logger logger = LoggerFactory.getLogger(Inventory.class.getName());
    public Map<Item, Integer> stock = new HashMap<>();
    private static Inventory inventory;

    private static final String filepath = "C:\\Users\\Dell\\IdeaProjects\\Developer_In_Test_March_2023\\Week7_Assignment\\src\\main\\resources\\ItemDetails";


    private Inventory(String filename) throws InvalidDataException {
        load(filename);
    }

    public static synchronized Inventory getInstance() throws InvalidDataException {
        if(inventory == null) {
            inventory = new Inventory(filepath);
        }
        return inventory;
    }

    /**
     * Load Inventory Stock Items
     * @param file name and path
     * @throws InvalidDataException - If Data provided is invalid
     */
    private void load(String file) throws InvalidDataException {
        try{
            logger.info("Loading the data");
            //Loading file fom Disk
            List<String> lines = Files.readAllLines(Paths.get(file));
            //Loop the file content and store the data into Item class
            for(String line: lines){
                if(!line.startsWith("Item code")) {
                    //Split the line and get the details.
                    String[] temp = line.split(",");
                    //Storing into Item object
                    int itemCode = Integer.parseInt(temp[0].trim());
                    String itemName = temp[1].trim();
                    String itemDesc = temp[2].trim();
                    double price = Double.parseDouble(temp[3].trim());
                    Item item = new Item(itemCode, itemName, itemDesc, price);
                    //Storing item into Map
                    logger.debug("Adding item to Inventory : {}", item);
                    stock.put(item, Integer.parseInt(temp[4].trim()));
                }
            }
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            throw new InvalidDataException("Invalid data");
        }
    }

    /**
     * Reduce the Stock Inventory for given Item
     * @param it
     * @param quantity
     * @return true If Items reduced from Stock
     * @throws ItemNotFoundException
     */
    public boolean reduceStock(Item it, Integer quantity) throws ItemNotFoundException {
        if (stock.containsKey(it)) {
            logger.info("Quantity passed: " + quantity);
            logger.info("Item Quantity in stock: " + stock.get(it));
            int updatedQty = stock.get(it) - quantity;
            logger.info("Updated quantity: " + updatedQty);
            stock.put(it, updatedQty);
            return true;
        }else {
            throw new ItemNotFoundException("Item not found!!");
        }
    }

    /**
     * Get the Number of Stock available in Inventory
     * @param it
     * @return Total number of Stock Inventory for given Item
     * @throws ItemNotFoundException
     */
    int getItemStock(Item it) throws ItemNotFoundException {
        if (stock.containsKey(it)) {
            logger.info("Number of items in stock for the Item passed is: " + stock.get(it));
            return stock.get(it);
        }else{
            throw new ItemNotFoundException("Item not found!!");
        }
    }

    /**
     * Check if Item given is valid
     * @param it
     * @return True - If Item is valid
     * @throws ItemNotFoundException
     */
    boolean validateItem(Item it) throws ItemNotFoundException {
       if(stock.containsKey(it)){
            return true;
        }
        else {
            logger.info("We didnt find the given item in stock!! " + it.getItemCode());
            throw new ItemNotFoundException("Item code didn't find!!!!");
        }
    }

    /**
     * Create Catalogue with ItemCode and ItemName
     * @return Item Catalogue map
     */
    Map< Integer, String> getItemCgetItemCatalogue(){
        Map<Integer, String> itemCatalogue= new HashMap<>();
        for (Map.Entry<Item,Integer> stockItem: stock.entrySet()) {
            Item temp = stockItem.getKey();
            itemCatalogue.put(temp.getItemCode(), temp.getItemName());
        }
        return  itemCatalogue;
    }

}
