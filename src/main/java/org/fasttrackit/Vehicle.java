package org.fasttrackit;

import java.time.LocalDate;
import java.util.Objects;

public class Vehicle {

    private static int totalCount;

    public Vehicle() {
        totalCount++;
    }

    private String name;
    private double mileage;
    private String color;
    private double maxSpeed;
    private boolean running;
    private double fuelLevel;
    private double traveledDistance;
    private LocalDate createdDate;

    public static int getTotalCount() {
        return totalCount;
    }


    public double accelerate (double speed, double duration){

        if (fuelLevel <= 0){
            System.out.println("You don't have enough fuel to accelerate." + "Fuel level: " + fuelLevel);
            return 0;
        }

        if (speed > maxSpeed) {
            System.out.println("Requested speed is too high. Maximum allowed: " + maxSpeed);
            return 0;
        }

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

    public double accelerate (double speed) {
       return accelerate (speed, 1);

    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isRunning() {
        return running;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", running=" + running +
                ", fuelLevel=" + fuelLevel +
                ", traveledDistance=" + traveledDistance +
                ", createdDate=" + createdDate +
                '}';


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.mileage, mileage) == 0 &&
                Double.compare(vehicle.maxSpeed, maxSpeed) == 0 &&
                running == vehicle.running &&
                Double.compare(vehicle.fuelLevel, fuelLevel) == 0 &&
                Double.compare(vehicle.traveledDistance, traveledDistance) == 0 &&
                Objects.equals(name, vehicle.name) &&
                Objects.equals(color, vehicle.color) &&
                Objects.equals(createdDate, vehicle.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mileage, color, maxSpeed, running, fuelLevel, traveledDistance, createdDate);
    }
}