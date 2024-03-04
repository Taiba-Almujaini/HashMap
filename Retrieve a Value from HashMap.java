
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

        int studentID = 1234; // Retrieve a student's name using their student ID :1234 .
        String studentName = getStudentName(studentMap, studentID);
        if (studentName != null) {
            System.out.println("Student name for ID " + studentID + ": " + studentName);
        } else {
            System.out.println("Student with ID " + studentID + " not found.");
        }

    }

    public static String getStudentName(HashMap<Integer, String> map, int studentID) {
        return map.get(studentID);
    }
}
