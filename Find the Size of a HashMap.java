
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


        System.out.println("Student ID :  Student Name");

        for (Integer Id : studentMap.keySet()) {
            System.out.println(Id + "\t\t" + studentMap.get(Id));
        }

        int HashMapSize = studentMap.size(); // print the size of student HashMap
        System.out.println("Size of the Student HashMap: " + HashMapSize);

    }

}