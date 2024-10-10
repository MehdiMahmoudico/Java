
public class Mammal {
    private int enrgyLevel = 100;
    
    public int displayEnergy() {
        System.out.println("Energy Level: " + enrgyLevel);
        return enrgyLevel;
    }

    public int getEnrgyLevel() {
        return enrgyLevel;
    }

    public void setEnrgyLevel(int enrgyLevel) {
        this.enrgyLevel = enrgyLevel;
    }
    
}