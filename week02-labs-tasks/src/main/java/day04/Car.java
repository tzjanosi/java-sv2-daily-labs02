package day04;

public class Car {
    int fuel;
    int distance;

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    public double averageConsumption() {
        return 100.0*fuel/distance;
    }
}
