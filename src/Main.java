public class Main {
    public static void main(String[] args) {

        Car myCar = new Car(4, "Electric", 120, 4);
        Bicycle myBicycle = new Bicycle(2, 25, 1);
        Truck myTruck = new Truck(6, 5000, 80, 3);
        Boat myBoat = new Boat(1, 30, 10);


        myCar.move();
        myBicycle.move();
        myTruck.move();
        myBoat.move();


        myCar.specialFunction();
        myBicycle.specialFunction();
        myTruck.specialFunction();
        myBoat.specialFunction();
    }
}
