import java.util.ArrayList;
import java.util.List;

public abstract class Aircraft {
    private String tag;
    private int numberSeats;
    private double takeOffWeight;
    private double cruisingSpeed;
    private double maxFlightAltitude;
    private double maxRange;
    private double fuelConsumption;

    public Aircraft(String tag, int numberSeats, double takeOffWeight, double cruisingSpeed, double maxFlightAltitude,
                    double maxRange, double fuelConsumption) {
        this.tag = tag;
        this.numberSeats = numberSeats;
        this.takeOffWeight = takeOffWeight;
        this.cruisingSpeed = cruisingSpeed;
        this.maxFlightAltitude = maxFlightAltitude;
        this.maxRange = maxRange;
        this.fuelConsumption = fuelConsumption;
    }

    public Aircraft(String tag, double takeOffWeight, double cruisingSpeed, double maxFlightAltitude, double maxRange,
                    double fuelConsumption) {
        this.tag = tag;
        this.takeOffWeight = takeOffWeight;
        this.cruisingSpeed = cruisingSpeed;
        this.maxFlightAltitude = maxFlightAltitude;
        this.maxRange = maxRange;
        this.fuelConsumption = fuelConsumption;
    }

    static Integer overallValueOfSeats(List<? extends Aircraft> list){
        int seats = 0;
        for (Aircraft airCraft : list){
            seats += airCraft.numberSeats;
        }
        System.out.println("Колличество поссадочных мест: " + seats);
        return seats;
    }
    static Integer overallValueOfWeight(List<Aircraft> list){
        int weight = 0;
        for (Aircraft airCraft : list){
            weight += airCraft.takeOffWeight;
        }
        System.out.println("Суммарная грузоподъемность: " + weight + " кг");
        return weight;
    }

    static List<Aircraft> fuelSorting(List<Aircraft> list, int lowerFlorLimit, int upperFlorLimit) {
        List<Aircraft> sortedFloat = new ArrayList<>();
        System.out.println("Список самолетов по критерию потребления горючего, в диапозоне от " + lowerFlorLimit +
                " до " + upperFlorLimit + " кг/ч:");
        for (Aircraft airCraft : list) {
            if (airCraft.fuelConsumption >= lowerFlorLimit && airCraft.fuelConsumption <= upperFlorLimit) {
                sortedFloat.add(airCraft);
                System.out.println(airCraft.toString());
            }
        }
        return sortedFloat;
    }

    @Override
    public String toString() {
        return "Судно " +
                "tag: " + tag +
                ", numberSeats: " + numberSeats +
                ", takeOffWeight: " + takeOffWeight +
                ", cruisingSpeed: " + cruisingSpeed +
                ", maxFlightAltitude: " + maxFlightAltitude +
                ", maxRange: " + maxRange +
                ", fuelConsumption: " + fuelConsumption;
    }
}
