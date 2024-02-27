public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .brand("Honda")
                .engineType("gasoline")
                .transmission("automatic")
                .color("blue")
                .passengerCap(23)
                .build();

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Engine Type: " + car.getEngineType());
        System.out.println("Transmission: " + car.getTransmission());
        System.out.println("Car Color: " + car.getColor());
        System.out.println("Passenger Capacity: " + car.getPassengerCap());

    }
}