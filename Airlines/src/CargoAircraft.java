import java.util.ArrayList;
import java.util.List;

public class CargoAircraft extends Aircraft{

    public CargoAircraft(String tag, double takeOffWeight, double cruisingSpeed, double maxFlightAltitude,
                              double maxRange, double fuelConsumption) {
        super(tag, takeOffWeight, cruisingSpeed, maxFlightAltitude, maxRange, fuelConsumption);
    }

    public static List<Aircraft> cargoAircraftList() {
        List<Aircraft> cargoAircraftList = new ArrayList<>();
        cargoAircraftList.add(new CargoAircraft("Airbus A300-600F", 42627, 875, 9600, 4344, 2600));
        cargoAircraftList.add(new CargoAircraft("MD-10-30F", 77110, 908, 10000, 5792, 2700));
        cargoAircraftList.add(new CargoAircraft("MD-11F", 77000, 840, 10500, 6150, 2700));
        cargoAircraftList.add(new CargoAircraft("Boeing 757F", 79015, 852, 9400, 5765, 2526));
        cargoAircraftList.add(new CargoAircraft("Boeing 767F", 351530, 905, 9500, 14594, 2600));
        cargoAircraftList.add(new CargoAircraft("Boeing 777F", 396890, 913, 9900, 13450, 9200));
        return cargoAircraftList;
    }
}