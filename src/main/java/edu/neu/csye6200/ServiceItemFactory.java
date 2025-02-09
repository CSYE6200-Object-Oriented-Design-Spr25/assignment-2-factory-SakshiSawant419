/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author sakshisawant
 */
public class ServiceItemFactory implements FactoryInterface{
    private static final ServiceItemFactory instance = new ServiceItemFactory();
    
    private ServiceItemFactory(){

    }

    public static ServiceItemFactory getInstance(){
        return instance;
    }

    @Override
    public Item createItem(String csv_String){
        return new ServiceItem(csv_String);
    }
}
