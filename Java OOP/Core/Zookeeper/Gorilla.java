
public class Gorilla extends Mammal {
    public void throwSomething() {
        System.out.println("The gorilla has thrown something!");
        setEnrgyLevel(getEnrgyLevel() - 5);
    }

    public void eatBananas() {
        System.out.println("The gorilla is satisfied after eating a banana!");
        setEnrgyLevel(getEnrgyLevel() + 10);
    }

    public void climb() {
        System.out.println("The gorilla has climbed a tree!");
        setEnrgyLevel(getEnrgyLevel() - 10);
    }

    
}