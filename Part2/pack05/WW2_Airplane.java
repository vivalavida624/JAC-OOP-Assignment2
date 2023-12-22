package Assignment02.Part1.Assignment02_2.pack05;

public class WW2_Airplane extends Aircraft {

    private boolean twinEngine;
    private long serialNumber;
    private long serialNumberstarter = 80000;

    public WW2_Airplane(){
        twinEngine = true;
        serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }

    public WW2_Airplane(double price, double maxElevation, boolean twinEngine) {
        super(price, maxElevation);
        this.twinEngine = twinEngine;
        serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }
    public WW2_Airplane(WW2_Airplane ww2_airplane){
        setPrice(ww2_airplane.getPrice());
        setMaxElevation(ww2_airplane.getMaxElevation());
        twinEngine = ww2_airplane.twinEngine;
        serialNumber = serialNumberstarter;
        serialNumberstarter++;
    }
    public long getNextSerialNumber(){
        return serialNumberstarter;
    }
    public boolean isTwinEngine() {
        return twinEngine;
    }

    public void setTwinEngine(boolean twinEngine) {
        this.twinEngine = twinEngine;
    }

    @Override
    public String toString() {
        return "This WW2_Airplane - " +
                "serial#" + serialNumber + "- " +
                "has a maximum elevation  " + getMaxElevation()  +
                " It is " + getPrice() + " Dollar";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        WW2_Airplane that = (WW2_Airplane) o;

        return twinEngine == that.twinEngine;
    }
}
