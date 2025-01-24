package org.ies.vehicles.components;

import org.ies.vehicles.model.Vehicle;

import java.util.Scanner;

public class VehicleReader {
    private final Scanner scanner;
    private final CarReader carReader;
    private final MotorbikeReader motorbikeReader;
    private final TruckReader truckReader;

    public VehicleReader(Scanner scanner, CarReader carReader, MotorbikeReader motorbikeReader, TruckReader truckReader) {
        this.scanner = scanner;
        this.carReader = carReader;
        this.motorbikeReader = motorbikeReader;
        this.truckReader = truckReader;
    }

    public Vehicle read(){
        int option;
        do {
            System.out.println("--Elige un vehiculo--");
            System.out.println("1.Coche");
            System.out.println("2.Moto");
            System.out.println("3.Camión");
            System.out.print("Opción: ");

            option = scanner.nextInt();
            scanner.nextLine();
        } while (option != 1 && option != 2 && option != 3);

        if (option == 1){
            return carReader.read();
        } else if (option == 2) {
            return motorbikeReader.read();
        } else {
            return truckReader.read();
        }
    }
}
