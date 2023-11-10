abstract class ACar implements Car {

    public final String registrationNumber;
    public final String make;
    public final String model;
    public final int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {  //Skeleton for both fuel and electric cars
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

}

