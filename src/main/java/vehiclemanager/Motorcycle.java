package vehiclemanager;

public class Motorcycle extends Vehicle {

    private final boolean hasSidecar;

    Motorcycle(String brand, String model, String color, int year, boolean hasSidecar) {
        super(brand, model, color, year);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    @Override
    public void displayInfo() {
        String sidecarStatus;
        if (hasSidecar) {
            sidecarStatus = "있음";
        } else {
            sidecarStatus = "없음";
        }
        System.out.printf("[오토바이] %s %s (%d), 색상:%s, 사이드카: %s\n",
                getBrand(), getModel(), getYear(), getColor(), sidecarStatus);
    }

}
