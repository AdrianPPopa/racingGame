package org.fasttrackit;

import java.time.LocalDate;

//inheritance or "is-a" relationship
public class Car extends AutoVehicle{


    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    int doorCount;

    public Car(Engine engine) {
        super(engine);
    }


    // "has-a" relationship

}