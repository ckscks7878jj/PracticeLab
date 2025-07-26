package vehiclemanager;

import java.util.ArrayList;
import java.util.List;

public class VehicleManager {

    private final List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void listAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("등록된 차량이 없습니다.");
        }
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }

    public void findVehicleByModel(String model) {
        boolean found = false;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getModel().equalsIgnoreCase(model)) {
                vehicle.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당 모델의 차량을 찾을 수 없습니다.");
        }

    }

    public void startAllEngines() {
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }

}
