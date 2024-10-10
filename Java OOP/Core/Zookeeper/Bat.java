public class Bat extends Mammal {
    public Bat() {
        setEnrgyLevel(300);
    }

    public void fly() {
        System.out.println("The bat is flying!");
        setEnrgyLevel(getEnrgyLevel() - 50);
    }

    public void eatHumans() {
        System.out.println("The bat has eaten a human!");
        setEnrgyLevel(getEnrgyLevel() + 25);
    }
    public void attackTown() {
        System.out.println("The bat has attacked a town!");
        setEnrgyLevel(getEnrgyLevel() - 100);
    }
}
