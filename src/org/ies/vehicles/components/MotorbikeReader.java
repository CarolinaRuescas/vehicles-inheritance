package org.ies.vehicles.components;

import org.ies.vehicles.model.Motorbike;

import java.util.Scanner;

public class MotorbikeReader {
    private final Scanner scanner;

    public MotorbikeReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Motorbike read(){
        System.out.println("--Datos de la moto--");
        System.out.println("Matricula: ");
        String plate = scanner.nextLine();

        System.out.println("Distacia recorrida: ");
        int km = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cilindrada: ");
        int cc = scanner.nextInt();
        scanner.nextLine();

        return new Motorbike(
                plate,
                km,
                cc
        );
    }
}
