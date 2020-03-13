import java.util.ArrayList;
import java.util.List;

public class PassengersAircraft extends Aircraft{

    public PassengersAircraft(String tag, int numberSeats, double takeOffWeight, double cruisingSpeed, double maxFlightAltitude,
                              double maxRange, double fuelConsumption) {
        super(tag, numberSeats, takeOffWeight, cruisingSpeed, maxFlightAltitude, maxRange, fuelConsumption);
    }

    public static List<Aircraft> PassengersAircraftList() {
        List<Aircraft> passengersAircraftList = new ArrayList<>();
        passengersAircraftList.add(new PassengersAircraft("Airbus A319", 138, 75000, 840, 11800, 6850, 2600));
        passengersAircraftList.add(new PassengersAircraft("Airbus A320", 168, 77000, 840, 11800, 6150, 2700));
        passengersAircraftList.add(new PassengersAircraft("Boeing 737-800", 189, 79015, 852, 12500, 5765, 2526));
        passengersAircraftList.add(new PassengersAircraft("Boeing 777-300/-300ER", 457, 351530, 905, 13100, 14594, 2600));
        passengersAircraftList.add(new PassengersAircraft("Boeing 747-400", 522, 396890, 913, 13100, 13450, 9200));
        return passengersAircraftList;
    }
}