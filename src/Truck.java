class Truck extends Vehicle {
    private int numberOfWheels;
    private int cargoCapacity;

    // Constructor
    public Truck(int numberOfWheels, int cargoCapacity, int speed, int capacity) {
        super("Truck", speed, capacity);
        this.numberOfWheels = numberOfWheels;
        this.cargoCapacity = cargoCapacity;
    }


    @Override
    public void specialFunction() {
        System.out.println("Truck specific function: Heavy Cargo Transport");
    }

}
