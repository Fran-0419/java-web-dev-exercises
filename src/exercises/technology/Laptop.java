package exercises.technology;

public class Laptop extends Computer {
    private int ram;

    public Laptop(String brand, double model, boolean inUse, int aRam ){
        super(brand, model, inUse);
        this.ram = aRam;

    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean hasGoodRam() {
        if(ram > 8){
            return true;
        } else{
            return false;
        }
    }

    public void increaseRam(){
        this.ram = ram*2;
    }

}
