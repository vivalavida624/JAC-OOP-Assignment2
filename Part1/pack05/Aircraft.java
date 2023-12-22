package Assignment02.Part1.pack05;

public class Aircraft {

    private double price;
    private double maxElevation;
    private long serialNumber;
    private long serialNumberStarter = 90000;

    public Aircraft(){
        price = 200000;
        maxElevation = 4;
    }

    public Aircraft(double price, double maxElevation) {
        this.price = price;
        this.maxElevation = maxElevation;
        serialNumber = serialNumberStarter;
        serialNumberStarter++;
    }

    public Aircraft(Aircraft aircraft){
        price = aircraft.getPrice();
        maxElevation = aircraft.getMaxElevation();
        serialNumber = serialNumberStarter;
        serialNumberStarter++;
    }
    public long getNextSerialNumber(){
        return serialNumberStarter;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMaxElevation() {
        return maxElevation;
    }

    public void setMaxElevation(double maxElevation) {
        this.maxElevation = maxElevation;
    }

    @Override
    public String toString() {
        return "This Aircraft - " +
                "serial#" + serialNumber + "- " +
                "has a maximum elevation  " + getMaxElevation()  +
                "It is " + getPrice() + " Dollar";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aircraft aircraft = (Aircraft) o;

        if (Double.compare(price, aircraft.price) != 0) return false;
        return Double.compare(maxElevation, aircraft.maxElevation) == 0;
    }

}


