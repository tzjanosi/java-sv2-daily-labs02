package day04;

public class GasStation {
    int price;

    public GasStation(int price) {
        this.price = price;
    }

    public int tanking(Car car, int fuel) {
        car.setFuel(fuel);
        return price*fuel;
    }
}
