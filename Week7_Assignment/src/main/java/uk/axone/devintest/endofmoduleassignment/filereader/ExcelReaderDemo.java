package uk.axone.devintest.endofmoduleassignment.filereader;

import uk.axone.devintest.endofmoduleassignment.model.Item;

import java.util.*;

public class ExcelReaderDemo {
    private static Map<Item,Integer>stock=new HashMap<>();

    public static void main(String[] args) {
        ExcelReader myReader=new ExcelReader("Week7_Assignment/Stock Data.xlsx","StockData");

        int rows = myReader.getRowCount();

        for(int i=0; i <rows ;i++) {
            if(i>0) {
               // stock.put(new Item(Integer.valueOf(myReader.getCellValue(i, 0)), myReader.getCellValue(i, 1), myReader.getCellValue(i, 2)), Integer.valueOf(myReader.getCellValue(i, 3)));
            }
        }


        for(Item item: stock.keySet()){
            System.out.println(item.getItemCode() +" "+item.getItemName() +" "+item.getItemDescription());
        }
    }
}
