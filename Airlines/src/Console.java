import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    static String lineType = "Категория самолетов. Введите номер.";
    static String lineVariantOfType = "1. Пассажирские самолеты; " + "2. Грузовые самолеты.";
    static String lineTask = "Операция. Ведите номер.";
    static String lineChooseTask = "1. Посчитать общую вместимость; " + "2. Посчитать общую грузоподъемность; " +
            "3. Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.";
    static String lineOutOfBounds = "Ошибка ввода данных";
    public static void StartMenu(){
        System.out.println(lineType);
        System.out.println(lineVariantOfType);
        Scanner scanner = new Scanner(System.in);
        try {
            int valueType = scanner.nextInt();
            if (valueType == 1){
                System.out.println(lineTask);
                System.out.println(lineChooseTask);
                int valueTask = scanner.nextInt();
                if (valueTask == 1){
                    Aircraft.OverallValueOfSeats(PassengersAircraft.PassengersAircraftList());
                }
                else if (valueTask == 2){
                    Aircraft.OverallValueOfWeight(PassengersAircraft.PassengersAircraftList());
                }
                else if (valueTask == 3){
                    System.out.println("Задайте диапазон.");
                    System.out.println("Нижний предел потребления горючего в кг/ч:");
                    int lowerFlorLimit = scanner.nextInt();
                    System.out.println("Верхний предел потребления горючего в кг/ч:");
                    int upperFlorLimit = scanner.nextInt();
                    Aircraft.FuelSorting(PassengersAircraft.PassengersAircraftList(), lowerFlorLimit, upperFlorLimit);
                }
                else {
                    System.out.println(lineOutOfBounds);
                }
            }
            else if (valueType == 2){
                System.out.println(lineTask);
                System.out.println(lineChooseTask);
                int valueTask = scanner.nextInt();
                if (valueTask == 1){
                    Aircraft.OverallValueOfSeats(CargoAircraft.CargoAircraftList());
                }
                else if (valueTask == 2){
                    Aircraft.OverallValueOfWeight(CargoAircraft.CargoAircraftList());
                }
                else if (valueTask == 3){
                    System.out.println("Задайте диапазон.");
                    System.out.println("Нижний предел потребления горючего в кг/ч:");
                    int lowerFlorLimit = scanner.nextInt();
                    System.out.println("Верхний предел потребления горючего в кг/ч:");
                    int upperFlorLimit = scanner.nextInt();
                    Aircraft.FuelSorting(CargoAircraft.CargoAircraftList(), lowerFlorLimit, upperFlorLimit);
                }
                else {
                    System.out.println(lineOutOfBounds);
                }
            }
            else {
                System.out.println(lineOutOfBounds);
            }
        } catch (InputMismatchException e){
            System.out.println("Ошибка формата данных.");
        }
    }
}
