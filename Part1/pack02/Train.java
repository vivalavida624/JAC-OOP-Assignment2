package Assignment02.Part1.pack02;

import Assignment02.Part1.pack01.WheeledTransportation;

public class Train extends WheeledTransportation {

    private int numberOfVehicle;
    private String startingStation;
    private String destinationStation;
    private long serialNumber;
    private long serialNumberstarter = 10000;

    public Train() {
        System.out.println("create form Train default cons");
        numberOfVehicle = 20;
        startingStation = "Montreal";
        destinationStation = "Toronto";
        serialNumber = serialNumberstarter;
        serialNumberstarter++;

    }

    public Train(int numberOfWheels, double maxSpeed, int numberOfVehicle, String startingStation, String destinationStation) {
        super(numberOfWheels, maxSpeed);
        this.numberOfVehicle = numberOfVehicle;
        this.startingStation = startingStation;
        this.destinationStation = destinationStation;
        serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }

    public Train(Train train){
        setNumberOfWheels(train.getNumberOfWheels());
        setMaxSpeed(train.getMaxSpeed());
        numberOfVehicle = train.numberOfVehicle;
        startingStation = train.startingStation;
        destinationStation = train.destinationStation;
        serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }
    public long getNextSerialNumber(){
        return serialNumberstarter;
    }

    public int getNumberOfVehicle() {
        return numberOfVehicle;
    }

    public void setNumberOfVehicle(int numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
    }

    public String getStartingStation() {
        return startingStation;
    }

    public void setStartingStation(String startingStation) {
        this.startingStation = startingStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    @Override
    public String toString() {
        return "This Train - " +
                "serial#" + serialNumber + "- " +
                "has " + getNumberOfWheels() + " wheels, " +
                "has a maximum speed of " + getMaxSpeed() + " km/hr." +
                "It has " + getNumberOfVehicle() + " vehicles " +
                "and its starting and destination station are " + getStartingStation() +
                " and " + getDestinationStation() +"."
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Train train = (Train) o;

        if (numberOfVehicle != train.numberOfVehicle) return false;
        if (!startingStation.equals(train.startingStation)) return false;
        return destinationStation.equals(train.destinationStation);
    }

}
