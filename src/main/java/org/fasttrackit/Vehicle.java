package org.fasttrackit;

import java.time.LocalDate;

public class Vehicle {

    String name;
    double mileage;
    String color;
    double maxSpeed;
    boolean running;
    double fuelLevel;
    double traveledDistance;
    LocalDate createdDate;

    public double accelerate (double speed, double duration){
        // concatenation
        System.out.println(name + " is accelerating with " + speed + " km/h for " + duration + "h.");

        double distance = speed * duration;

        System.out.println("Travel " + distance + "km.");

//        traveledDistance = traveledDistance + distance;
        // same result as the above statement
        traveledDistance += distance;
        //logs (printed information to understand what is happening in the app)
        System.out.println("Total travel distance: " + traveledDistance + "km.");

        double spentFuel = mileage / distance * 100;
        System.out.println("Spent fuel: " + spentFuel + "1.");

//        fuelLevel = fuelLevel - spentFuel;
        //same as above
        fuelLevel -= spentFuel;
        System.out.println("Remaining fuel: " + fuelLevel + " 1.");

        return distance;
    }
}