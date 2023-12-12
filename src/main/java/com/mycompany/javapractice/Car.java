/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author Noor
 */
abstract class Car {
    protected String brand;
    protected String model;
    
    //abstract methods(does not have a body)
    public abstract void accelerate();
    public abstract void brake();
    
    //regular method 
    public void honk(){
        System.out.println("The " + brand + " " + model + " is honking.");
    }
          
             
}
