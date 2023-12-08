class Boat extends Vehicle {
    private int numberOfSails;


    public Boat(int numberOfSails, int speed, int capacity) {
        super("Boat", speed, capacity);
        this.numberOfSails = numberOfSails;
    }


    @Override
    public void specialFunction() {
        System.out.println("Boat specific function: Sailing on Water");
    }

}
