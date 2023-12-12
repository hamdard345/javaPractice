/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.javapractice;

/**
 *
 * @author Noor
 */
public class JavaPractice {

    public static void main(String[] args) {
        SportsCar mySportsCar = new SportsCar("Ferrari", "488 GTB", 205); // Create an object of SportsCar
        mySportsCar.accelerate(); // Call the accelerate method
        mySportsCar.brake(); // Call the brake method
        mySportsCar.honk(); // Call the honk method

        SUV mySUV = new SUV("Toyota", "Land Cruiser", 112); // Create an object of SUV
        mySUV.accelerate(); // Call the accelerate method
        mySUV.brake(); // Call the brake method
        mySUV.honk();
    }
}
