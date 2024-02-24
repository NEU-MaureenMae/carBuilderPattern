public class Car{
    private final String brand, engineType, transmission, color;
    private final int passengerCap;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.engineType = builder.engineType;
        this.transmission = builder.transmission;
        this.color = builder.color;
        this.passengerCap = builder.passengerCap;
    }

    public String getBrand() {
        return brand;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getColor(){
        return color;
    }

    public int getPassengerCap(){
        return passengerCap;
    }

    public static class CarBuilder(){
        private final String brand, engineType, tranmission, color;
        private final int passengerCap; 

        public CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public CarBuilder transmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder passengerCap(int passengerCap) {
            this.passengerCap = passengerCap;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}