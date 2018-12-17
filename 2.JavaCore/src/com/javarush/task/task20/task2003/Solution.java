package com.javarush.task.task20.task2003;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        load(new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine()));
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties p = new Properties();
        properties.forEach((k, v) -> p.setProperty(k, v));
        p.store(outputStream, null);
        outputStream.close();
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties p = new Properties();
        p.load(inputStream);
        p.forEach((k, v) -> properties.put(String.valueOf(k), String.valueOf(v)));
        inputStream.close();
    }

    public static void main(String[] args) throws Exception {
    }
}