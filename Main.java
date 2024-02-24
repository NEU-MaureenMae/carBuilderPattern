public class Main(){
    public static void main(String[] args) {
        Car car = new car.CarBuilder()
                .brand("Honda");
                .engineType("gasoline");
                .transmission("automatic");
                .color("blue");
                .passengerCap(23);
                .build();

        System.out.println("Brand: " + car.brand);        
        System.out.println("Engine Type: " + car.engineType);        
        System.out.println("Transmission: " + car.transmission);        
        System.out.println("Car Color: " + car.color);        
        System.out.println("Passenger Capacity: " + car.passengerCap);        


                
}