class Bicycle extends Vehicle {
    private int numberOfWheels;

    // Constructor
    public Bicycle(int numberOfWheels, int speed, int capacity) {
        super("Bicycle", speed, capacity);
        this.numberOfWheels = numberOfWheels;
    }


    @Override
    public void specialFunction() {
        System.out.println("Bicycle specific function: Exercise");
    }


}
