package org.FasttrackIT;

import java.time.LocalDate;

public class Vehicle {
    String name;
    double mileage;
    String color;
    double maxspeed;
    boolean running;
    double fuelLevel;
    double traveledDistance;
    LocalDate createdDate;

    public double accelerate(double speed, double duration){
        //concatenation
        System.out.println(name + " is accelerating with " + speed + " km/h for " + duration + " h. " );

        double distance = speed * duration;
        System.out.println("Traveled " + distance + " km. " );

//        traveledDistance = traveledDistance + distance;
        //same result as the above statement
        traveledDistance += distance;

        //logs (informatiile printate)
        System.out.println(" Total traveled distance: " + traveledDistance + " km.");

        double spentFuel = distance / 100 * mileage;
        System.out.println("Spent fuel: " + spentFuel + " l.");

//        fuelLevel = fuelLevel - spentFuel;
        // same as above
        fuelLevel -= spentFuel;

        System.out.println("Remaining fuel: " + fuelLevel + " l. ");

        return distance;


    }


}
