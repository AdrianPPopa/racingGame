package org.fasttrackit;

import java.time.LocalDate;

public class AutoVehicle extends Vehicle{
    Engine engine;

    LocalDate createdDate;

    public AutoVehicle(Engine engine){
        this.engine = engine;
    }
}
