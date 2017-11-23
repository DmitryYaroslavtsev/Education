package Chapter_7;

public class Vehicle_Ch_7 {
    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle_Ch_7(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return fuelcap * mpg;
    }

    double fuelneeded(int miles) {
        return (double) miles/mpg;
    }
    int getPassengers() {return passengers;}
    void setPassengers(int p) {passengers = p;}

    int getFuelcap() { return fuelcap;}
    void setFuelcap(int f) {fuelcap = f;}

    int getMpg() { return mpg;}
    void setMpg(int m) { mpg = m;}
}
