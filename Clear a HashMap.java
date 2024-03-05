
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

        // clear the Hashmap
        studentMap.clear();

       // Check if the HashMap is empty
        if (studentMap.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }

    }

}