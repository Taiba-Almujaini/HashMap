


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

        // Iterate through the keySet of the HashMap and print key-value pairs
        System.out.println("Key-Value pairs in the HashMap:");
        for (Integer studentId : studentMap.keySet()) {
            String studentName = studentMap.get(studentId);
            System.out.println("Key: " + studentId + ", Value: " + studentName);
        }
    }

}