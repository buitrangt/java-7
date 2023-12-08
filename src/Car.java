class Car extends Vehicle {
    private int numberOfWheels;
    private String engineType;


    public Car(int numberOfWheels, String engineType, int speed, int capacity) {
        super("Car", speed, capacity);
        this.numberOfWheels = numberOfWheels;
        this.engineType = engineType;
    }


    @Override
    public void specialFunction() {
        System.out.println("Car specific function: Automatic Parking");
    }

}
