interface Car {

    String getRegistrationNumber();   //registaion plate

    String getMake();   //Car Brand

    String getModel();   //Car Model

    int getNumberOfDoors();  //number of doors

    int getRegistrationFee() throws IllegalAccessException;    //Calculates the registration fee for the car

}
