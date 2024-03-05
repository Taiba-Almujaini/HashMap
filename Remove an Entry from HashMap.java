
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
       Integer studentIdToRemove = 1236; // Example student ID to remove
        String removedStudentName = studentMap.remove(studentIdToRemove);

        if (removedStudentName != null) {
            System.out.println("Removed student: " + removedStudentName);
        } else {
            System.out.println("Student with ID " + studentIdToRemove + " not found in the HashMap.");
        }

// Print the updated HashMap
        System.out.println("Updated HashMap:");
        for (Integer id : studentMap.keySet()) {
            System.out.println(id + "\t\t" + studentMap.get(id));
        }

    }

}