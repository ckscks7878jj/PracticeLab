package vehiclemanager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleManager vehicleManager = new VehicleManager();

        while (true) {
            System.out.println("\n=== 차량 관리 시스템 ===");
            System.out.println("1. 차량 추가");
            System.out.println("2. 전체 차량 목록 보기");
            System.out.println("3. 특정 차량 검색 (모델명)");
            System.out.println("4. 모든 차량 시동 걸기");
            System.out.println("0. 종료");
            System.out.println("======================");

            System.out.print("메뉴 선택: ");
            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력해주세요!");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("추가할 차량 타입을 선택하세요 (1: 자동차, 2: 오토바이): ");
                    int selectedCarType = sc.nextInt();
                    sc.nextLine();

                    if (selectedCarType == 1) {
                        System.out.print("제조사: ");
                        String brand = sc.nextLine();
                        System.out.print("모델명: ");
                        String model = sc.nextLine();
                        System.out.print("색상: ");
                        String color = sc.nextLine();
                        System.out.print("연식: ");
                        int year = sc.nextInt();
                        System.out.print("문의 개수: ");
                        int numDoors = sc.nextInt();

                        Car car = new Car(brand, model, color, year, numDoors);
                        vehicleManager.addVehicle(car);
                        System.out.printf("'%s %s' 차량이 추가되었습니다.\n", brand, model);

                    } else if (selectedCarType == 2) {
                        System.out.print("제조사: ");
                        String brand = sc.nextLine();
                        System.out.print("모델명: ");
                        String model = sc.nextLine();
                        System.out.print("색상: ");
                        String color = sc.nextLine();
                        System.out.print("연식: ");
                        int year = sc.nextInt();
                        sc.nextLine();
                        System.out.print("사이드카가 있습니까? (Y/N): ");
                        String sidecar = sc.nextLine();
                        boolean hasSidecar = sidecar.equalsIgnoreCase("Y");

                        Motorcycle motorcycle = new Motorcycle(brand, model, color, year, hasSidecar);
                        vehicleManager.addVehicle(motorcycle);
                        System.out.println("'" + brand + model + "' 차량이 추가되었습니다.");
                    } else {
                        System.out.println("잘못된 차량 타입입니다. 1 또는 2를 입력해주세요.");
                        continue;
                    }
                    continue;
                case 2:
                    System.out.println("--- 전체 차량 목록 ---");
                    vehicleManager.listAllVehicles();
                    System.out.println("---------------------");
                    continue;
                case 3:
                    System.out.print("검색할 차량의 모델을 입력하세요: ");
                    String modelName = sc.nextLine();
                    vehicleManager.findVehicleByModel(modelName);
                    continue;
                case 4:
                    vehicleManager.startAllEngines();
                    continue;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }
        }
    }
}