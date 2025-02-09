/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author sakshisawant
 */
public class ElectronicItemFactory implements FactoryInterface{
    private static ElectronicItemFactory instance;

    private ElectronicItemFactory(){

    }

    public static ElectronicItemFactory getInstance(){
        if(instance == null){
            instance = new ElectronicItemFactory();
        }
        return instance;
    }

    @Override
    public Item createItem(String csv_String){
        return new ElectronicItem(csv_String);
    }
    
}
