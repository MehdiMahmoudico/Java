
public class Phone extends Device{
    public Phone(int battery) {
        super();
    }

    public void makecall(){
        System.out.println("Phone making a call...");
    }
    public void playgame(){
        System.out.println("Phone playing a game...");
    }
    public void charge(){
        System.out.println("Phone battery status: " + status());
        System.out.println("Phone battery level: " + getBattery());
        setBattery(20);
        System.out.println("Phone charging...");
    }
    
}