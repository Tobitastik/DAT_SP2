public class GasolinCar extends AFuelCar {

    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, String fuelType, int kmPrLitre) {    //Skeleton for the gasoline car
        super(registrationNumber, make, model, numberOfDoors, fuelType, kmPrLitre);
    }

    public String toString() {  //Printing the gasoline car
        return "Gasoline Car{" +
                "Registration number = " + getRegistrationNumber() +
                ", Maker = " + getMake() +
                ", Model = " + getModel() +
                ", Number of doors = " + getNumberOfDoors() +
                ", Fuel type = " + getFuelType() +
                "KM/L = " + getKmPrLitre() + '}';
    }

    protected int getRegistationFee() throws IllegalAccessException {   //Calculation for the registration fee for the gasoline car
        int registationFee = 0;

        if (getKmPrLitre() < 5) {
            registationFee = 10470;
        } else if (getKmPrLitre() >= 5 || getKmPrLitre() < 10) {
            registationFee = 5500;
        } else if (getKmPrLitre() >= 10 || getKmPrLitre() < 15) {
            registationFee = 2340;
        } else if (getKmPrLitre() >= 15 || getKmPrLitre() < 20) {
            registationFee = 1050;
        } else if (getKmPrLitre() >= 20 || getKmPrLitre() < 50) {
            registationFee = 330;
        } else {
            throw new IllegalAccessException("Invalid KM/L input");
        }
        return registationFee;
    }

    @Override
    public int getRegistrationFee() throws IllegalAccessException {
        return getRegistationFee();
    }
}
