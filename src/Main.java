public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        FleetOfCars fleet = new FleetOfCars();

        ElectricCar electricCar1 = new ElectricCar("AB 12345", "Telsa", "Model Y", 5, 75, 300); //creating different cars
        ElectricCar electricCar2 = new ElectricCar("CD 67890", "Nissan", "Leaf", 3, 40, 150);

        GasolinCar gasCar1 = new GasolinCar("AF 34567", "Audi", "A6", 5, "Gas", 20);

        DieselCar dieselCar1 = new DieselCar("DF 12384", "Citroën", "C4", 5, "Diesel", 20, false);

        /*try {
            System.out.println(electricCar1.getModel() + " has a range of " + electricCar1.getMaxRangeKM() + " and have a registration fee of: " + electricCar1.getRegistationFee() + " dkr");  //Just a quick test to show data from one of each car
            System.out.println(gasCar1.getModel() + " drives on " + gasCar1.getFuelType() + " and have a registration fee of: " + gasCar1.getRegistationFee() + " dkr");
            System.out.println(dieselCar1.getModel() + " drives on " + dieselCar1.getFuelType() + " and have a registration fee of: " + dieselCar1.getRegistationFee() + " dkr," + " particle filter: " + dieselCar1.hasParticleFilter());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }*/

        System.out.println("\n");

        fleet.addCar(electricCar1); //adding the cars to the arraylist
        fleet.addCar(electricCar2);
        fleet.addCar(gasCar1);
        fleet.addCar(dieselCar1);

        System.out.println(fleet);
        System.out.println("Total cost: " + fleet.getTotalRegistrationFeeForFleet());
    }
}
