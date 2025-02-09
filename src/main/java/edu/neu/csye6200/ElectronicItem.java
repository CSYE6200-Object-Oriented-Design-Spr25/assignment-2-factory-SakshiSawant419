/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author sakshisawant
 */
public class ElectronicItem extends Item{
    private int warranty_Period;

    public ElectronicItem(String csvString){
        super(0,"",0);
        String[] parts = csvString.split(",");
        if(parts.length == 4){
            super.id = Integer.parseInt(parts[0]);
            super.name = parts[1];
            super.price = Double.parseDouble(parts[2]);
            this.warranty_Period = Integer.parseInt(parts[3]);
        }
    }

    @Override
    public String toString(){
        return super.toString() + "  (Warranty : " + warranty_Period + " months)";
    }
}
