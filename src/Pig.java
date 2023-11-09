public class Pig {
    private String color;
    private int penSize;
    private boolean wallowed;
    private double weight;
    public Pig(){
        color = "black";
        penSize = 8;
        wallowed = true;
        weight = 500.0;
    }
    public Pig(String c, int p, boolean wa, double w){
        color = c;
        penSize = p;
        wallowed = wa;
        weight = w;
    }
    public void makeNoise(){
        System.out.println("OINK OINK OINK");
    }
    public void upgradePenSize(int amount){
        penSize += amount;
    }
    public void displayPig(){
        System.out.println("\nColor: " + color + "\nPen Size: " + penSize + "\nMud Wallowed: " + wallowed + "\nWeight: " + weight);
    }
}
