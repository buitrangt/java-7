abstract class Vehicle implements Moveable {
    private String type;
    private int speed;
    private int capacity;

    // Constructor
    public Vehicle(String type, int speed, int capacity) {
        this.type = type;
        this.speed = speed;
        this.capacity = capacity;
    }


    public void move() {
        System.out.println(type + " is moving.");
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public abstract void specialFunction();
}
