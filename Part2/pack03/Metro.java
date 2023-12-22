package Assignment02.Part1.Assignment02_2.pack03;

import Assignment02.Part1.Assignment02_2.pack02.Train;

public class Metro extends Train {

    private int numberOfStops;
    private long serialNumber;
    private long serialNumberstarter = 25000;

    public Metro(){
        numberOfStops = 15;
        serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }

    public Metro(int numberOfWheels, double maxSpeed, int numberOfVehicle, String startingStation, String destinationStation, int numberOfStops) {
        super(numberOfWheels, maxSpeed, numberOfVehicle, startingStation, destinationStation);
        this.numberOfStops = numberOfStops;
        this.serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }

    public Metro(Metro metro) {
        setNumberOfWheels(metro.getNumberOfWheels());
        setMaxSpeed(metro.getMaxSpeed());
        setNumberOfVehicle(metro.getNumberOfVehicle());
        setStartingStation(metro.getStartingStation());
        setDestinationStation(metro.getDestinationStation());
        serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }
    public long getNextSerialNumber(){
        return serialNumberstarter;
    }

    public int getNumberOfStops() {
        return numberOfStops;
    }

    public void setNumberOfStops(int numberOfStops) {
        this.numberOfStops = numberOfStops;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "This Metro - " +
                "serial#" + serialNumber + "- " +
                "has " + getNumberOfWheels() + " wheels, " +
                "has a maximum speed of " + getMaxSpeed() + " km/hr." +
                "It has " + getNumberOfVehicle() + " vehicles " +
                "and its starting and destination station are " + getStartingStation() +
                " and " + getDestinationStation() +"." +
                " It has " + getNumberOfStops() + " stops."
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Metro metro = (Metro) o;

        return numberOfStops == metro.numberOfStops;
    }
}
