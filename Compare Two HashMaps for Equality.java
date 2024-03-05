
import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        // Create the first HashMap
        HashMap<Integer, String> studentMapOne = new HashMap<>();

        // Add student entries to the HashMap
        studentMapOne.put(1234, "Taiba");
        studentMapOne.put(1235, "Afnan");
        studentMapOne.put(1236, "Nourah");


        // Create the second HashMap
        HashMap<Integer, String> studentMapTwo = new HashMap<>();
        studentMapTwo.put(2121, "Shimaa");
        studentMapTwo.put(2345, "Sara");
        studentMapTwo.put(2789, "Muna");

        // Check if the two HashMaps are equal
        boolean areEqual = studentMapOne.equals(studentMapTwo);

        // Print the result
        System.out.println("Are the two HashMaps equal? " + areEqual);
    }

}