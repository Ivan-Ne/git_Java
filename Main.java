package Man;

public class Main {
    public static void main(String[] args) {

        // Input
        String s = "Это Егор, ему 33 года, его рост 175.5 см. Должность - программист.";

        // Method substring, cut name
        String name = s.substring(4,8);
        // Method substring, cut age
        String ageString = s.substring(14,16);
        // Method substring, cut height
        String heightString = s.substring(32,38);
        // Method substring, cut position
        String position = s.substring(54,65);

        // Method parseInt, parses the string ageString to int age
        int age = Integer.parseInt(ageString);
        // Method parseDouble, parses the string heightString to double height
        double height = Double.parseDouble(heightString);

        // Create an object man of class "Man"
        Man man = new Man(name, position, age, height);

        // Output
        System.out.println("Имя: " + man.getName() + "\nВозраст: " + man.getAge()
                + "\nРост: " + man.getHeight() + "\nДолжность: " + man.getPosition());

    }
}
