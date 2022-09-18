public class Main {
    public static void main(String[] args) {
        Car car = new Car("LADA",4);
        Truck truck = new Truck("КАМАЗ", 10);
        Bicycle bicycle = new Bicycle("BMX", 2);

        ServiceStation station = new ServiceStation();
        station.check(bicycle);
        station.check(car);
        station.check(truck);
    }
}