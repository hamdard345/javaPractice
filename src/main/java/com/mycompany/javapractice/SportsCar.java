/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author Noor
 */
public class SportsCar extends Car {

    private int topSpeed;

    public SportsCar(String brand, String model, int topSpeed) {
        this.brand = brand;
        this.model = model;
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        System.out.println("The " + brand + " " + model + " accelerates quickly to a top speed of " + topSpeed + " mph.");
    }

    public void brake() {
        System.out.println("The " + brand + " " + model + " brakes quickly.");
    }

}
