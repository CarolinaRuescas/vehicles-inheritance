package org.ies.vehicles;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var truck = new Truck("5628GMJ",12000, 3);
        var car = new Car("6325GVM", 52000, 5, 120);
        var motorbike = new Motorbike("0215FGM", 64000, 150);

        truck.showInfo();
        truck.move();

        car.showInfo();
        car.move();

        motorbike.showInfo();
        motorbike.move();
    }
}