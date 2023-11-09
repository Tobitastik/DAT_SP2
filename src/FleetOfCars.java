import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet;


    public FleetOfCars() {
        fleet = new ArrayList<>();
    }

    public void addCar(Car car) {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet() throws IllegalAccessException {
        int totalFee = 0;
        for (Car car : fleet) {
            totalFee += car.getRegistrationFee();
        }
        return totalFee;
    }

    @Override
    public String toString() {
        StringBuilder fleetString = new StringBuilder("Fleet:\n");
        for (Car car : fleet) {
            fleetString.append(car).append("\n");
        }
        return fleetString.toString();
    }

}
