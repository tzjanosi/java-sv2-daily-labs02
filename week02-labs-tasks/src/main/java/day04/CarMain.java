package day04;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car=new Car();

        System.out.println("Type in the fuel consumption (l):");
        int fuel = scanner.nextInt();
        car.setFuel(fuel);
        System.out.println("Type in the distance (km):");
        int distance = scanner.nextInt();
        car.setDistance(distance);
        System.out.println("The average consumption is: "+car.averageConsumption()+"l/100km");
        System.out.println();

        GasStation gasStation=new GasStation(499);
        System.out.println("Type in the new volume of fuel (l):");
        fuel = scanner.nextInt();
        int price=gasStation.tanking(car,fuel);
        System.out.println("The price is: "+price);
        System.out.println("Type in the new distance (km):");
        distance = scanner.nextInt();
        car.setDistance(distance);
        System.out.println("The new average consumption is: "+car.averageConsumption()+"l/100km");

    }
}
