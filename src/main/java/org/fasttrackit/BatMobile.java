package org.fasttrackit;

public class BatMobile extends Vehicle{

        @Override
        public double accelerate (double speed, double duration){
            // concatenation
            System.out.println(getName() + " is accelerating with " + speed + " km/h for " + duration + "h.");

            double distance = speed * duration * 2;

            System.out.println("Travel " + distance + "km. Cheater");

            setTraveledDistance(getTraveledDistance() + distance );

            //logs (printed information to understand what is happening in the app)
            System.out.println("Total travel distance: " + getTraveledDistance() + "km.");

            return distance;
    }
    // Method signature must be the same, except:
    // 1.co-variant return type
    // (returned object must inherit what the overridden method was returning)
    // 2.Overriding method can allow larger access than we allowed in the super-class
    @Override
    protected Vehicle clone () throws  CloneNotSupportedException{
            return new Vehicle();
    }
}
