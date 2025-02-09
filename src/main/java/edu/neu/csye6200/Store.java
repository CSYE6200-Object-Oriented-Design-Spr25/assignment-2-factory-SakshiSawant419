/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author sakshisawant
 */
public class Store extends AbstractStore {
    
    private List<Item> items;
    public Store(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void sortID() {
        Collections.sort(items, (item1, item2) -> Integer.compare(item1.id, item2.id));
    }

    public void sortName() {
        Collections.sort(items, (item1, item2) -> item1.name.compareTo(item2.name));
    }

    public void sortPrice() {
        Collections.sort(items, (item1, item2) -> Double.compare(item1.price, item2.price));
    }

    @Override
    public void demo(){
        
        List<String> foodItems = FileUtil.readCSV("./src/main/java/edu/neu/csye6200/FoodItemCSV.txt");
        System.out.println("=============FOOD ITEMS=============");
        for (String string : foodItems) {
            FoodItem f = new FoodItem(string);
            System.out.println(f.toString());
        }

        List<String> electronicItems = FileUtil.readCSV("./src/main/java/edu/neu/csye6200/ElectronicItemCSV.txt");
        System.out.println("\n=============ELECTRONIC ITEMS=============");
        for (String string : electronicItems) {
            ElectronicItem e = new ElectronicItem(string);
            System.out.println(e.toString());
        }

        List<String> serviceItems = FileUtil.readCSV("./src/main/java/edu/neu/csye6200/ServiceItemCSV.txt");
        System.out.println("\n=============SERVICE ITEMS=============");
        for (String string : serviceItems) {
            ServiceItem s = new ServiceItem(string);
            System.out.println(s.toString());
        }
        
        FactoryInterface foodItemFactory = new FoodItemFactory();
        FactoryInterface electronicItemFactory = ElectronicItemFactory.getInstance();
        FactoryInterface serviceItemFactory = ServiceItemFactory.getInstance();

        Item foodItem1 = foodItemFactory.createItem(foodItems.get(0));
        Item foodItem2 = foodItemFactory.createItem(foodItems.get(1));
        Item foodItem3 = foodItemFactory.createItem(foodItems.get(2));
        addItem(foodItem1);
        addItem(foodItem2);
        addItem(foodItem3);

        Item electronicItem1 = electronicItemFactory.createItem(electronicItems.get(0));
        Item electronicItem2 = electronicItemFactory.createItem(electronicItems.get(1));
        Item electronicItem3 = electronicItemFactory.createItem(electronicItems.get(2));
        Item serviceItem1 = serviceItemFactory.createItem(serviceItems.get(0));
        Item serviceItem2 = serviceItemFactory.createItem(serviceItems.get(1));
        Item serviceItem3 = serviceItemFactory.createItem(serviceItems.get(2));
        addItem(electronicItem1);
        addItem(electronicItem2);
        addItem(electronicItem3);
        addItem(serviceItem1);
        addItem(serviceItem2);
        addItem(serviceItem3);

        sortID();
        System.out.println("\nSorted by ID :");
        for (Item item : items) {
            System.out.println(item);
        }

        sortName();
        System.out.println("\nSorted by Name :");
        for (Item item : items) {
            System.out.println(item);
        }

        sortPrice();
        System.out.println(" \nSorted by Price :");
        for (Item item : items) {
            System.out.println(item);
        }
    }

}
