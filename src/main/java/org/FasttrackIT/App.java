package org.FasttrackIT;


public class App 
{
    public static void main( String[] args )
    {
        Engine engine = new Engine();
        engine.manufacturer = "Renault";

        Car car = new Car(engine);
        car.setName("Dacia");
        car.setColor("blue");
        car.doorCount = 4;
        car.setMileage(9.5);
        car.setFuelLevel(50);
        car.setRunning(true);

// nu mai are rost, deja am dat motorul prin constructor        car.engine = engine;
        System.out.println("Our engine is..");
        System.out.println(car.engine.manufacturer);

        Car car2 = new Car(engine);
        car2.setName("Fiat");
        car2.setColor("red");
        car2.doorCount = 2;
        car2.setMileage(7.5);
        car2.setFuelLevel(60);
        car2.setRunning(true);


        Car car3 = car;


        System.out.println(car.getName());
        System.out.println(car3.getName());

        System.out.println("Changing values...");

        car.setName("Dacia Logan");
        System.out.println(car.getName());
        System.out.println(car3.getName());

        System.out.println(car.getMaxspeed());
        System.out.println(car.engine);

        double distance = car.accelerate(60, 0.5);
      //  distance = car.accelerate(60, 0.5);
        System.out.println("Distance in App.main: " + distance);
// added accelerate method for vehicles


        System.out.println("Total vehicles: " + Vehicle.getTotalCount());
//demo for static variables (class variables)
//        System.out.println("Studying static variables...");
//
//        car.totalCount = 1;
//        System.out.println("Total count from car: " +car.totalCount);
//        car2.totalCount = 2;
//        System.out.println("Total count from car after setting car2: " + car.totalCount);
//        System.out.println("Total count from car: " +car2.totalCount);
//        System.out.println("Total count from Vehicle class: " + Vehicle.totalCount);

    }
}
