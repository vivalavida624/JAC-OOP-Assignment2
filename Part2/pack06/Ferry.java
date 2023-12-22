package Assignment02.Part1.Assignment02_2.pack06;

public class Ferry {

    private double maxSpeed;
    private double maxLoad;
    private long serialNumber;
    private long serialNumberstarter = 70000;

    public Ferry(){
        maxSpeed = 160;
        maxLoad = 1000;
        serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }

    public Ferry(double maxSpeed, double maxLoad) {
        this.maxSpeed = maxSpeed;
        this.maxLoad = maxLoad;
        serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }
    public Ferry(Ferry ferry){
        maxSpeed = ferry.maxSpeed;
        maxLoad = ferry.maxLoad;
        serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }
    public long getNextSerialNumber(){
        return serialNumberstarter;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return "This Ferry - " +
                "serial#" + serialNumber + "- " +
                "has a maximum speed of " + maxSpeed + " km/hr." +
                "It has a maximum load weight " + getMaxLoad() + " kg";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ferry ferry = (Ferry) o;

        if (Double.compare(maxSpeed, ferry.maxSpeed) != 0) return false;
        return Double.compare(maxLoad, ferry.maxLoad) == 0;
    }
}
