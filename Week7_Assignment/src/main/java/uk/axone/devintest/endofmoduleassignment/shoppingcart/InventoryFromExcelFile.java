package uk.axone.devintest.endofmoduleassignment.shoppingcart;

import uk.axone.devintest.endofmoduleassignment.exception.InvalidDataException;
import uk.axone.devintest.endofmoduleassignment.filereader.ExcelReader;
import uk.axone.devintest.endofmoduleassignment.exception.ItemNotFoundException;
import uk.axone.devintest.endofmoduleassignment.model.Item;

import java.util.*;

public class InventoryFromExcelFile {

   Map<Item, Integer> stock = new HashMap<>();  // item as key and quantity as value

    public InventoryFromExcelFile() throws InvalidDataException {
        load();
    }

    private void load() throws InvalidDataException {
        //int data = 10/0;
        ExcelReader myReader = new ExcelReader("Week7_Assignment/Stock Data.xlsx", "StockData");
        int rows = myReader.getRowCount();
        for (int i = 0; i < rows; i++) {
            if (i > 0) {
                stock.put(new Item( //item as key
                        Integer.valueOf(myReader.getCellValue(i, 0)), //itemCode
                        myReader.getCellValue(i, 1),                  //itemName
                        myReader.getCellValue(i, 2),                  // itemDescription
                        Integer.valueOf(myReader.getCellValue(i, 3))),//itemPrice
                        Integer.valueOf(myReader.getCellValue(i, 4))); //quantity as value
            }
        }
    }

    /*
     * returns true if the operation is successful
     */
    public boolean reduceStock(Item it, Integer quantity) throws ItemNotFoundException {

        for (Map.Entry<Item, Integer> stockMap : stock.entrySet()) {
            if(it.getItemName().equals(stockMap.getKey().getItemName())){
                stock.replace(it,quantity);
                return true;
            } else {
                throw new ItemNotFoundException("Item is not found in stock");
            }
        }
        return false;
    }

    /*
     * returns the number of items in stock for the Item passed.
     */
    public int getItemStock(Item it) throws ItemNotFoundException {
        return stock.get(it);
    }

    /*
    * returns true if the itemCode of the Item passed matches a product in the list
     */
    public boolean validateItem(Item it) throws ItemNotFoundException {
        for (Map.Entry<Item, Integer> stockMap : stock.entrySet()) {
            if(Objects.equals(it.getItemCode(), stockMap.getKey().getItemCode())) {
                return true;
            } else {
                throw new ItemNotFoundException("Item not found in the stock");
            }
        }
        return false;
    }

    /*
     * returns itemCodes and ItemNames as a map
     * This can be used to identify what items are available to shop
     */
    public Map< Integer, String> getItemCatalouge() throws InvalidDataException {
        Map<Integer, String> itemCodeNameMap = new HashMap<>();
        for(Item item: stock.keySet()){
            itemCodeNameMap.put(item.getItemCode(),item.getItemName());
        }
        return itemCodeNameMap;
    }
}
