public class DieselCar extends AFuelCar {

    private boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, String fuelType, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, fuelType, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    protected int getRegistationFee() throws IllegalAccessException {
        int registationFee = 0;

        if (getKmPrLitre() < 5) {
            registationFee = 15260;
        } else if (getKmPrLitre() >= 5 || getKmPrLitre() < 10) {
            registationFee = 2770;
        } else if (getKmPrLitre() >= 10 || getKmPrLitre() < 15) {
            registationFee = 1850;
        } else if (getKmPrLitre() >= 15 || getKmPrLitre() < 20) {
            registationFee = 1390;
        } else if (getKmPrLitre() >= 20 || getKmPrLitre() < 50) {
            registationFee = 130;
        } else {
            throw new IllegalAccessException("Invalid KM/L input");
        }

        if (hasParticleFilter() == false) {
            registationFee = registationFee + 1000;
        }
        return registationFee;
    }

    public String toString() {
        return "Diesel Car{" +
                "Registration number='" + getRegistrationNumber() + '\'' +
                ", Maker = '" + getMake() + '\'' +
                ", Model = '" + getModel() + '\'' +
                ", Number of doors = " + getNumberOfDoors() + '\'' +
                ", Fuel type = " + getFuelType() + '\'' +
                " KM/L = " + getKmPrLitre() + '\'' +
                " Particle filter = " + hasParticleFilter() + '}';
    }

    @Override
    public int getRegistrationFee() throws IllegalAccessException {
        return getRegistationFee();
    }

}

