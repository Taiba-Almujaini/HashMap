
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

        // Remove a student from the HashMap using their student ID
        int studentIdToCheck = 1235; // Example student ID to check

       // Check if the student ID exists in the HashMap
        boolean studentIdExists = studentMap.containsKey(studentIdToCheck);

       // Print the boolean indicating the existence of the student ID
        System.out.println("Does student ID " + studentIdToCheck + " exist in the HashMap? " + studentIdExists);

    }

}