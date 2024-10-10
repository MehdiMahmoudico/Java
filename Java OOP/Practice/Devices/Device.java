
public class Device {
    private int battery=20;
    public Device() {
        this.battery = battery;
    }
    public int getBattery() {
        return battery;
    }
    public void setBattery(int battery) {
        this.battery = battery;
    }
    public String status(){
        if (battery < 20) {
            return "Low battery";
        } else if (battery < 50) {
            return "Medium battery";
        } else {
            return "High battery";
        }
    }
    
}