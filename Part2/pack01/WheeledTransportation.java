package Assignment02.Part1.Assignment02_2.pack01;

public class WheeledTransportation {

    private int numberOfWheels;
    private double maxSpeed;
    private long serialNumber;
    private long serialNumberStarter = 00000;

    public WheeledTransportation() {
        numberOfWheels = 4;
        maxSpeed = 200;
        serialNumber = serialNumberStarter;
        serialNumberStarter++;
    }

    public WheeledTransportation(int numberOfWheels, double maxSpeed) {
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
        this.serialNumber = serialNumberStarter;
        serialNumberStarter++;

    }

    public WheeledTransportation(WheeledTransportation wheeledTransportation) {
        numberOfWheels = wheeledTransportation.numberOfWheels;
        maxSpeed = wheeledTransportation.maxSpeed;
        serialNumber = serialNumberStarter;
        serialNumberStarter++;

    }

    public long getNextSerialNumber() {
        return serialNumberStarter;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "This WheeledTransportation - " +
                "serial#" + serialNumber + "- " +
                "has " + numberOfWheels + " wheels, " +
                "has a maximum speed of " + maxSpeed + " km/hr.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WheeledTransportation that = (WheeledTransportation) o;
        return numberOfWheels == that.numberOfWheels && Double.compare(maxSpeed, that.maxSpeed) == 0;

    }
}
