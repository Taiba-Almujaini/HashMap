
import java.util.HashMap;

public class StudentMap {
    public static void main(String[] args) {
        // Create a HashMap to store student IDs and names
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Add student entries to the HashMap
        studentMap.put(1234, "Taiba");
        studentMap.put(1235, "Afnan");
        studentMap.put(1236, "Nourah");
        studentMap.put(1237, " Shimaa");
        studentMap.put(1238, " Sara");

       // Specific student name to check
        String studentNameToCheck = "Afnan"; // Example student name to check
        
        // Check if the student name exists in the HashMap
        boolean studentNameExists = studentMap.containsValue(studentNameToCheck);

        // Print the boolean indicating the existence of the student name
        System.out.println("Does student name '" + studentNameToCheck + "' exist in the HashMap? " + studentNameExists);


    }

}