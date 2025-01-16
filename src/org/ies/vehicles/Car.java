package org.ies.vehicles;

import java.util.Objects;

public class Car extends Vehicle{
    private int doors;
    private int horsepower;

    public Car(String plate, int km, int doors, int horsepower) {
        super(plate, km);
        this.doors = doors;
        this.horsepower = horsepower;
    }

    public void showInfo() {
        System.out.println("Datos del vehículo:");
        System.out.println("El coche tiene " + doors + " puertas, es de " + horsepower + " CV, tiene hechos " + km + " kilómetros, y su matrícula es " + plate + ".");
    }

    @Override
    public void move() {
        System.out.println("El vehículo ha recorrido " + km + " Kilometros más");
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return doors == car.doors && horsepower == car.horsepower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doors, horsepower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", hoursepower=" + horsepower +
                ", km=" + km +
                ", plate='" + plate + '\'' +
                '}';
    }
}
