package Man;

// Class "Man"
public class Man {

    // Name
    private String name;
    // Position
    private String position;
    // Age
    private int age;
    // Height
    private double height;

    // Constructor
    public Man(String name, String position, int age, double height) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.height = height;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Position
    public String getPosition() {
        return position;
    }

    // Getter for Age
    public int getAge() {
        return age;
    }

    // Getter for Height
    public double getHeight() {
        return height;
    }
}
