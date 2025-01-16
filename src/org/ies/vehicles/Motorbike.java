package org.ies.vehicles;

import java.util.Objects;

public class Motorbike extends Vehicle{
    private int displacement;

    public Motorbike(String plate, int km, int displacement) {
        super(plate, km);
        this.displacement = displacement;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorbike motorbike = (Motorbike) o;
        return displacement == motorbike.displacement;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), displacement);
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "displacement=" + displacement +
                ", km=" + km +
                ", plate='" + plate + '\'' +
                '}';
    }
}
