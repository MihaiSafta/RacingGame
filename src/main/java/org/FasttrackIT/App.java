package org.FasttrackIT;


public class App 
{
    public static void main( String[] args )
    {
        Engine engine = new Engine();
        engine.manufacturer = "Renault";

        Car car = new Car(engine);
        car.name = "Dacia";
        car. color = "blue";
        car.doorCount = 4;
        car.mileage = 9.5;
        car.fuelLevel = 50;
        car.running = true;

// nu mai are rost, deja am dat motorul prin constructor        car.engine = engine;
        System.out.println("Our engine is..");
        System.out.println(car.engine.manufacturer);

        Car car2 = new Car(engine);
        car2.name = "Fiat";
        car2.color = "red";
        car2.doorCount = 2;
        car2.mileage = 7.5;
        car2.fuelLevel = 60;
        car2.running = true;


        Car car3 = car;

        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println("Changing values...");

        car.name = "Dacia Logan";

        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println(car.maxspeed);
        System.out.println(car.engine);

        double distance = car.accelerate(60, 0.5);
      //  distance = car.accelerate(60, 0.5);
        System.out.println("Distance in App.main: " + distance);
// added accelerate method for vehicles



    }
}
