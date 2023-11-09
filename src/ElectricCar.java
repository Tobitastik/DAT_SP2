public class ElectricCar extends ACar {

    private final int batteryCapacity;
    private final int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKM() {
        return maxRange;
    }

    public int getWhPrKm() {
        int WhPrKM = batteryCapacity / maxRange;
        return WhPrKM;
    }

    public int getRegistationFee() throws IllegalAccessException {
        int registationFee = 0;
        double electricCarRange = (getWhPrKm() / 91.25) / 100;
        if (electricCarRange < 5) {
            registationFee = 10470;
        } else if (electricCarRange >= 5 || electricCarRange < 10) {
            registationFee = 5500;
        } else if (electricCarRange >= 10 || electricCarRange < 15) {
            registationFee = 2340;
        } else if (electricCarRange >= 15 || electricCarRange < 20) {
            registationFee = 1050;
        } else if (electricCarRange >= 20 || electricCarRange < 50) {
            registationFee = 330;
        } else {
            throw new IllegalAccessException("Invalid electric car battery/range input");
        }
        return registationFee;
    }

    public String toString() {
        return "Electric Car{" +
                "Registration number = '" + getRegistrationNumber() + '\'' +
                ", Maker = '" + getMake() + '\'' +
                ", Model = '" + getModel() + '\'' +
                ", Number of doors = " + getNumberOfDoors() +
                ", Battery capacity = " + batteryCapacity +
                ", Max range=" + maxRange +
                '}';
    }

    @Override
    public String getMake() {
        return super.getMake();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getNumberOfDoors() {
        return super.getNumberOfDoors();
    }

    @Override
    public int getRegistrationFee() throws IllegalAccessException {
        return getRegistationFee();
    }
}
