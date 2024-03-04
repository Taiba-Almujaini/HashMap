
import java.util.HashMap;

public class StudentMap {
    public static void main(String[] args) {
        // Create a HashMap to store student IDs and names
        HashMap<Integer, String> StudentMap = new HashMap<>();

        // Add student entries to the HashMap
        StudentMap.put(1234, "Taiba");
        StudentMap.put(1235, "Afnan");
        StudentMap.put(1236, "Nourah");
        StudentMap.put(1237, " Shimaa");
        StudentMap.put(1238, " Sara");


        System.out.println("Student ID :  Student Name");

        for (Integer Id : StudentMap.keySet()) {
            System.out.println(Id + "\t\t" + StudentMap.get(Id));
        }

        int studentID = 1234; // Retrieve a student's name using their student ID :1234 .
        String studentName = getStudentName(StudentMap, studentID);
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
