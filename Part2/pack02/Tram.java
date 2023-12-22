package Assignment02.Part1.Assignment02_2.pack02;

import Assignment02.Part1.Assignment02_2.pack03.Metro;

public class Tram extends Metro {

    private int yearOfCreation;
    private long serialNumber;
    private long serialNumberstarter = 30000;

    public Tram(){
        yearOfCreation = 20;
        serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }

    public Tram(int numberOfWheels, double maxSpeed, int numberOfVehicle, String startingStation, String destinationStation,
                int numberOfStops, int yearOfCreation) {
        super(numberOfWheels, maxSpeed, numberOfVehicle, startingStation, destinationStation, numberOfStops);
        this.yearOfCreation = yearOfCreation;
        this.serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }
    public Tram(Tram tram){
        setNumberOfWheels(tram.getNumberOfWheels());
        setMaxSpeed(tram.getMaxSpeed());
        setNumberOfVehicle(tram.getNumberOfVehicle());
        setStartingStation(tram.getStartingStation());
        setDestinationStation(tram.getDestinationStation());
        setNumberOfStops(tram.getNumberOfStops());
        yearOfCreation = tram.getYearOfCreation();
        serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }
    public long getNextSerialNumber(){
        return serialNumberstarter;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    @Override
    public long getSerialNumber() {
        return serialNumber;
    }

    @Override
    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "This Tram - " +
                "serial#" + serialNumber + "- " +
                "has " + getNumberOfWheels() + " wheels, " +
                "has a maximum speed of " + getMaxSpeed() + " km/hr." +
                "It has " + getNumberOfVehicle() + " vehicles " +
                "and its starting and destination station are " + getStartingStation() +
                " and " + getDestinationStation() +"." +
                " It has " + getNumberOfStops() + " stops." +
                "It was created on year " + getYearOfCreation() +"."
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Tram tram = (Tram) o;

        return yearOfCreation == tram.yearOfCreation;
    }

}
