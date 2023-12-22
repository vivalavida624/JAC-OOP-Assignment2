package Assignment02.Part1.pack04;

import Assignment02.Part1.pack01.WheeledTransportation;

public class Monowheel extends WheeledTransportation {

    private double maxWeight;
    private long serialNumber;
    private long serialNumberstarter = 55000;

    public Monowheel(){
        maxWeight = 3000;
        serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }

    public Monowheel(int numberOfWheels, double maxSpeed, double maxWeight) {
        super(numberOfWheels, maxSpeed);
        this.maxWeight = maxWeight;
        serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }
    public Monowheel(Monowheel monowheel){
        setNumberOfWheels(monowheel.getNumberOfWheels());
        setMaxSpeed(monowheel.getMaxSpeed());
        maxWeight = monowheel.maxWeight;
        serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }
    public long getNextSerialNumber(){
        return serialNumberstarter;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "This Monowheel - " +
                "serial#" + serialNumber + "- " +
                "has " + getNumberOfWheels() + " wheels, " +
                "has a maximum of weight " + getMaxWeight() + " kg.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Monowheel monowheel = (Monowheel) o;

        return Double.compare(maxWeight, monowheel.maxWeight) == 0;
    }

}
