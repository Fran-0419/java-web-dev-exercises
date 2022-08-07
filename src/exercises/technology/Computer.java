package exercises.technology;

public class Computer{
    private String brand ;
    private boolean inUse ;
    private double model ;
    public Computer (String aBrand, double aModel, boolean aInUse){
        this.brand = aBrand;
        this.model = aModel;
        this.inUse = aInUse;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isInUse() {
        return inUse;
    }

    public double getModel() {
        return model;
    }

    public void setBrand(String aBrand) {
        this.brand = brand;
    }

    public void setModel(double aModel) {
        this.model = model;
    }

    public void upgradeModel(double newModel){
        this.model = this.model + newModel;
    }

    public void isInUse(boolean state){
        this.inUse = state;
    }
}
