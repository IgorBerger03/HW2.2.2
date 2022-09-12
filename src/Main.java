public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 4);
        Truck truck = new Truck("Kamaz", 6);
        Bicycle bicycle = new Bicycle("Stels", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(bicycle);
        station.check(truck);

    }
}