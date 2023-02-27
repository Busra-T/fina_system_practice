package com.fina.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    //we're limiting access with private. With static, we make sure it's created and loaded before anything else.
    private static Properties properties=new Properties();

    static {
        try {
            FileInputStream file=new FileInputStream("configuration.properties");

            properties.load(file);

            file.close();

        } catch (IOException e){
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!!!");
            e.printStackTrace();

        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }



}
