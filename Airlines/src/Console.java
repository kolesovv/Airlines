import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    private static String lineType = "Категория самолетов. Введите номер.";
    private static String lineVariantOfType = "1. Пассажирские самолеты; " + "2. Грузовые самолеты.";
    private static String lineTask = "Операция. Ведите номер.";
    private static String lineChooseTask = "1. Посчитать общую вместимость; " + "2. Посчитать общую грузоподъемность; " +
            "3. Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.";
    private static String lineOutOfBounds = "Ошибка ввода данных";
    public static void startMenu(){
        System.out.println(lineType);
        System.out.println(lineVariantOfType);
        Scanner scanner = new Scanner(System.in);
        try {
            int valueType = scanner.nextInt();
            if (valueType == 1){
                System.out.println(lineTask);
                System.out.println(lineChooseTask);
                dataProcessingPassengers(scanner.nextInt());
            }
            else if (valueType == 2){
                System.out.println(lineTask);
                System.out.println(lineChooseTask);
                dataProcessingCargo(scanner.nextInt());
            }
            else {
                System.out.println(lineOutOfBounds);
            }
        } catch (InputMismatchException e){
            System.out.println("Ошибка формата данных.");
        }
        scanner.close();
    }

    public static void dataProcessingPassengers(int valueTask){
        Scanner scanner = new Scanner(System.in);
        if (valueTask == 1){
                Aircraft.overallValueOfSeats(PassengersAircraft.passengersAircraftList());
            }
            else if (valueTask == 2){
                Aircraft.overallValueOfWeight(PassengersAircraft.passengersAircraftList());
            }
            else if (valueTask == 3){
                System.out.println("Задайте диапазон.");
                System.out.println("Нижний предел потребления горючего в кг/ч:");
                int lowerFlorLimit = scanner.nextInt();
                System.out.println("Верхний предел потребления горючего в кг/ч:");
                int upperFlorLimit = scanner.nextInt();
                Aircraft.fuelSorting(PassengersAircraft.passengersAircraftList(), lowerFlorLimit, upperFlorLimit);
            }
            else {
                System.out.println(lineOutOfBounds);
            }
            scanner.close();
    }

    public static void dataProcessingCargo(int valueTask){
        Scanner scanner = new Scanner(System.in);
        if (valueTask == 1){
            Aircraft.overallValueOfSeats(CargoAircraft.cargoAircraftList());
        }
        else if (valueTask == 2){
            Aircraft.overallValueOfWeight(CargoAircraft.cargoAircraftList());
        }
        else if (valueTask == 3){
            System.out.println("Задайте диапазон.");
            System.out.println("Нижний предел потребления горючего в кг/ч:");
            int lowerFlorLimit = scanner.nextInt();
            System.out.println("Верхний предел потребления горючего в кг/ч:");
            int upperFlorLimit = scanner.nextInt();
            Aircraft.fuelSorting(CargoAircraft.cargoAircraftList(), lowerFlorLimit, upperFlorLimit);
        }
        else {
            System.out.println(lineOutOfBounds);
        }
        scanner.close();
    }
}
