import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet;   //Arraylist to keep track of the fleet


    public FleetOfCars() {
        fleet = new ArrayList<>();
    }

    public void addCar(Car car) {
        fleet.add(car);
    }   //method to add car to arraylist

    public int getTotalRegistrationFeeForFleet() throws IllegalAccessException {    //Calculating the total fee of the fleet
        int totalFee = 0;
        for (Car car : fleet) {
            totalFee += car.getRegistrationFee();
        }
        return totalFee;
    }

    @Override
    public String toString() {      //Print each car of the fleet and its data
        StringBuilder fleetString = new StringBuilder("Fleet:\n");
        for (Car car : fleet) {
            fleetString.append(car).append("\n");
        }
        return fleetString.toString();
    }

}
