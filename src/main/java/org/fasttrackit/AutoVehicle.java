package org.fasttrackit;

import java.time.LocalDate;

public class AutoVehicle extends Vehicle{
    Engine engine;

    LocalDate createdDate;

    public AutoVehicle(Engine engine){
        this.engine = engine;
    }

    public AutoVehicle() {
        this(new Engine());
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public LocalDate getCreatedDate() {
        return createdDate;
    }

    @Override
    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}