package org.FasttrackIT;

public class Vehicle{




    private static int totalCount;

    private String name;
   private double mileage;
   private String color;
   private double maxspeed;
   private boolean running;
   private double fuelLevel;
   private double traveledDistance;

   public Vehicle(){
       totalCount ++; // incrementare +1
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
