package org.FasttrackIT;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        car.name = "Dacia";
        car. color = "blue";
        car.doorCount = 4;
        car.mileage = 9.5;
        car.running = true;



        Engine engine = new Engine();
        engine.manufacturer = "Renault";

        car.engine = engine;
        System.out.println("Our engine is..");
        System.out.println(car.engine.manufacturer);

        Car car1 = new Car();
        car1.name = "Fiat";
        car1.color = "red";
        car1.doorCount = 2;
        car1.mileage = 7.5;
        car1.running = true;


        Car car3 = car;

        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println("Changing values...");

        car.name = "Dacia Logan";

        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println(car.maxspeed);
        System.out.println(car.engine);



    }
}
