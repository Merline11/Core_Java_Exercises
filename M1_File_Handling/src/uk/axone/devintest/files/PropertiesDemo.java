package uk.axone.devintest.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("M1_File_Handling/src/application.properties");
        Properties properties = new Properties();
        properties.load(fis);
        String value = properties.getProperty("URL");
        System.out.println("URL : "+value);

        String value1 = properties.getProperty("count");
        System.out.println("count : "+value1);
        int val=Integer.parseInt(value1);
        System.out.println(val);


    }
}
