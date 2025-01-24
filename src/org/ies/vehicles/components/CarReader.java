package org.ies.vehicles.components;

import org.ies.vehicles.model.Car;

import java.util.Scanner;

public class CarReader {
    private final Scanner scanner;

    public CarReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Car read(){
        System.out.println("--DATOS DEL COCHE");
        System.out.println("Matrícula: ");
        String plate = scanner.nextLine();

        System.out.println("Distancia recorrida");
        int km = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Puertas del coche: ");
        int doorsNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Caballos: ");
        int cv = scanner.nextInt();
        scanner.nextLine();

        return new Car(
                plate,
                km,
                doorsNumber,
                cv
        );
    }
}
