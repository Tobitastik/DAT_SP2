abstract class AFuelCar extends ACar {
    public int kmPrLitre;
    public String fuelType;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, String fuelType, int kmPrLitre) {  //Skeleton for making a fuel car
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
        this.fuelType = fuelType;
    }

    protected int getKmPrLitre() {
        return kmPrLitre;
    }

    protected String getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
