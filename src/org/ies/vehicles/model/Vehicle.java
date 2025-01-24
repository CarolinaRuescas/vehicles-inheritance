package org.ies.vehicles.model;

import java.util.Objects;

public abstract class Vehicle {
    protected int km;
    protected String plate;

    public Vehicle(String plate, int km) {
        this.plate = plate;
        this.km = km;
    }

    public  void move(int distance){
        km += distance;
        System.out.println("Recorridos" + distance + " más");
    }
    public abstract void showInfo();

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return km == vehicle.km && Objects.equals(plate, vehicle.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(km, plate);
    }

}
