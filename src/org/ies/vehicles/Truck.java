package org.ies.vehicles;

import java.util.Objects;

public class Truck extends Vehicle {
    private int axes;

    public Truck(String plate, int km, int axes) {
        super(plate, km);
        this.axes = axes;
    }

    @Override
    public void move() {
        System.out.println("El vehículo ha recorrido " + km + "Kilometros más");
    }

    @Override
    public void showInfo() {
        System.out.println("Datos del vehículo:");
        System.out.println("El camión tiene " + axes + " ejes, tiene hechos " + km + " kilómetros, y su matrícula es " + plate + ".");
    }

    public int getAxes() {
        return axes;
    }

    public void setAxes(int axes) {
        this.axes = axes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return axes == truck.axes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), axes);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "axes=" + axes +
                ", km=" + km +
                ", plate='" + plate + '\'' +
                '}';
    }

}
