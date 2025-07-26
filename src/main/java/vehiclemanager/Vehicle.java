package vehiclemanager;

public abstract class Vehicle {
    private final String brand;
    private final String model;
    private final String color;
    private final int year;

    Vehicle(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void startEngine() {
        System.out.println(getModel() + "의 시동을 겁니다.");
    }

    public abstract void displayInfo();

}
