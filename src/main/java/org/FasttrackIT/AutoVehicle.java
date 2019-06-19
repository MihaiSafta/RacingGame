package org.FasttrackIT;

public class AutoVehicle extends Vehicle {

    // "has-a" relasionship (agregare= functioneaza si individual)
    Engine engine;

    public AutoVehicle(Engine engine){
        this.engine = engine;

    }

    public AutoVehicle() {
        this(new Engine());
    }
}
