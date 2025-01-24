package org.ies.vehicles.components;

import org.ies.vehicles.model.Truck;

import java.util.Scanner;

public class TruckReader {
    private final Scanner scanner;

    public TruckReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Truck read(){
        System.out.println("--Datos del camión--");
        System.out.println("Matricula: ");
        String plate = scanner.nextLine();

        System.out.println("Distacia recorrida: ");
        int km = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Ejes: ");
        int axis = scanner.nextInt();
        scanner.nextLine();

        return new Truck(
                plate,
                km,
                axis
        );
    }
}
