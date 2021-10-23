package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Test2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Car[] cars = fillCarArray(scanner);
            printCarToConsole(cars);
        }

        private static Car[] fillCarArray(Scanner scanner) {
            Car[] cars = new Car[0];
            int carIndex = 0;

            while (true) {
                String maxSpeed, brandName, color, vinNumber;

                System.out.println("Please fill brand name \n");
                brandName = scanner.nextLine();
                if (brandName.toLowerCase(Locale.ROOT).contains("lada")) {
                    System.out.println("Это уже слишком!");
                    break;
                }
                cars = raiseArraySize(cars);

                System.out.println("Please fill max speed \n");
                maxSpeed = scanner.nextLine();
                maxSpeed = checkMaxSpeed(maxSpeed, scanner);

                System.out.println("Please fill color \n");
                color = scanner.nextLine();

                System.out.println("Please fill vin number \n");
                vinNumber = scanner.nextLine();

                cars[carIndex] = new Car(maxSpeed, brandName, color, vinNumber);

                carIndex++;
            }
            return cars;
        }

        private static String checkAutoBrand(final String brand, final Scanner scanner) {
            String carBrand = brand;
            if (carBrand.toLowerCase(Locale.ROOT).contains("lada")) {
                System.out.println("Подумай еще раз!");
                System.out.println("Пожалуйста!");
                carBrand = checkAutoBrand(scanner.nextLine(), scanner);
            }

            return carBrand;
        }

        private static void printCarToConsole(Car[] cars) {
            int index = 0;
            for (Car car : cars) {
                if (car == null){
                    break;
                }

                System.out.println(index + ": " + car.getBrandName() + " " + car.getColor());
                index++;
            }
            System.out.println("Array size is: " + cars.length);
        }

        private static String checkMaxSpeed(String maxSpeed, Scanner scanner) {
            String carSpeed = maxSpeed;
            if (carSpeed.matches("\\d+")) {
                return carSpeed;
            } else {
                System.out.println("Значение должно содержать только числа");
                carSpeed = checkMaxSpeed(scanner.nextLine(), scanner);
            }
            return carSpeed;
        }

        private static Car[] raiseArraySize(Car[] cars) {
            return Arrays.copyOf(cars, cars.length + 1);
        }

    }
