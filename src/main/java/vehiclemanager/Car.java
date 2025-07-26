package vehiclemanager;

public class Car extends Vehicle {

    private final int numDoors;

    Car(String brand, String model, String color, int year, int numDoors) {
        super(brand, model, color, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public void displayInfo() {
        System.out.printf("[자동차] %s %s (%d), 색상:%s, 문 개수: %d\n",
                getBrand(), getModel(), getYear(), getColor(), getNumDoors());
    }

}
