public class Cow {
    private String name;
    private double weight;
    private int age;
    private boolean gender;
    public Cow(){
        name = "Unknown";
        weight = 77.5;
        age = 0;
        gender = true;
    }
    public Cow(String n, double w, int a, boolean g){
        name = n;
        weight = w;
        age = a;
        gender = g;
    }
    public void makeNoise(){
        System.out.println("MOO MOO MOO");
    }
    public void haveBirthday(){
        age += 1;
    }
    public void displayCow(){
        System.out.println("\nName: " + name + "\nWeight: " + weight + "\nAge: " + age + "\nGender: " + gender);
    }
}
