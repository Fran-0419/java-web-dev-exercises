package exercises.technology;

public class SmartPhone extends  Computer {
    private int battery ;
    public SmartPhone(String brand, double model, boolean inUse, int aBattery ){
        super(brand, model, inUse);
        this.battery = aBattery;

    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void call(){
        this.battery = battery -1;
    }

    public int batteryStatus() {
        return this.battery;
    }
}
