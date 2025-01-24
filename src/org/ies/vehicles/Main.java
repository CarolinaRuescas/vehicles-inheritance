package org.ies.vehicles;

import org.ies.vehicles.components.CarReader;
import org.ies.vehicles.components.MotorbikeReader;
import org.ies.vehicles.components.TruckReader;
import org.ies.vehicles.components.VehicleReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var carReader = new CarReader(scanner);
        var motorbikeReader = new MotorbikeReader(scanner);
        var truckReader = new TruckReader(scanner);
        var vehicleReader = new VehicleReader(
                scanner,
                carReader,
                motorbikeReader,
                truckReader
        );

        var vehicle = vehicleReader.read();

        vehicle.showInfo();
    }
}