package org.FasttrackIT;

import java.util.Objects;

public class Vehicle {


    private static int totalCount;

    private String name;
    private double mileage;
    private String color;
    private double maxspeed;
    private boolean running;
    private double fuelLevel;
    private double traveledDistance;

    public Vehicle() {
        totalCount++; // incrementare +1
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

    public double getMaxspeed() {
        return maxspeed;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
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

    public static int getTotalCount() {
        return totalCount;
    }

    public double accelerate(double speed, double durationInHours) {
        if (fuelLevel <= 0) {
            System.out.println("You don`t have enough fuel to accelerate. Fuel level: " + fuelLevel);
            return 0;
        }
        if (speed >= maxspeed) {
            System.out.println("Requested speed is too high. Maximum allowed: " + maxspeed);
            return 0;
        }


        //concatenation
        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + " h. ");

        double distance = speed * durationInHours;
        System.out.println("Traveled " + distance + " km. ");

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

    public double accelerate(double speed) {
        return  accelerate(speed, 1);
    }


    //suprascriere
//co-variant return type (returned object must inherit what the overridden method was returning)
//Method Signature must be the same, except:
// 1. co-variant return type
    // 2.Overriding method can allow larger access than was allowed in the super-class

    @Override
    protected Vehicle clone() throws CloneNotSupportedException {
        return new Vehicle();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxspeed +
                ", running=" + running +
                ", fuelLevel=" + fuelLevel +
                ", traveledDistance=" + traveledDistance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.mileage, mileage) == 0 &&
                Double.compare(vehicle.maxspeed, maxspeed) == 0 &&
                running == vehicle.running &&
                Double.compare(vehicle.fuelLevel, fuelLevel) == 0 &&
                Double.compare(vehicle.traveledDistance, traveledDistance) == 0 &&
                Objects.equals(name, vehicle.name) &&
                Objects.equals(color, vehicle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mileage, color, maxspeed, running, fuelLevel, traveledDistance);
    }
}





