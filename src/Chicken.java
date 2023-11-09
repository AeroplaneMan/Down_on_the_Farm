public class Chicken {
    private String breed;
    private int numEggs;
    private boolean mean;
    private double weight;
    public Chicken(){
        breed = "Rhode Island Red";
        numEggs = 1;
        mean = true;
        weight = 5.7;
    }
    public Chicken(String b, int n, boolean m, double w){
        breed = b;
        numEggs = n;
        mean = m;
        weight = w;
    }
    public void makeNoise(){
        System.out.println("CLUCK CLUCK CLUCK");
    }
    public void eatFood(int amount) {
        weight += amount;
    }
    public void displayChicken(){
        System.out.println("\nBreed: " + breed + "\nEggs per day: " + numEggs + "\nRude: " + mean + "\nWeight: " + weight);
    }
}
