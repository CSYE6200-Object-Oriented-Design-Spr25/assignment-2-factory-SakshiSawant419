/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author sakshisawant
 */
public class FoodItemFactory implements FactoryInterface{
    @Override
    public Item createItem(String csv_String){
        return new FoodItem(csv_String);
    }
}
