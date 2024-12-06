package TechMpRACTISE;
import java.util.HashMap;
import java.util.Map;

// Student Class
class Student {
    private String name;
    private int id;
    private int score;
    private String scholarshipScheme;

    public Student(String name, int id, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
        this.scholarshipScheme = assignScholarship(score);
    }

    private String assignScholarship(int score) {
        if (score > 95) {
            return "scheme a";
        } else if (score >= 90 && score <= 95) {
            return "scheme b";
        } else {
            return "no scheme";
        }
    }

    public String getScholarshipScheme() {
        return scholarshipScheme;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Id: " + id + " Score: " + score + " ScholarshipScheme: " + scholarshipScheme;
    }
}

// StudentService Class
class StudentService {
    private Map<Integer, Student> studentMap;

    public StudentService() {
        studentMap = new HashMap<>();
    }

    // Add a student to the map
    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
    }

    // Display students based on scholarship scheme
    public void displayStudentsByScholarship(String scheme) {
        boolean found = false;
        for (Student student : studentMap.values()) {
            if (student.getScholarshipScheme().equalsIgnoreCase(scheme)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found for the scholarship scheme: " + scheme);
        }
    }

    // Delete a student by ID
    public boolean deleteStudent(int id) {
        return studentMap.remove(id) != null;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        // Adding students
        Student s1 = new Student("Alice", 10, 94);
        Student s2 = new Student("Bob", 11, 96);
        Student s3 = new Student("Charlie", 12, 85);

        studentService.addStudent(s1);
        studentService.addStudent(s2);
        studentService.addStudent(s3);

        // Display students based on scholarship scheme
        System.out.println("Students under 'scheme b':");
        studentService.displayStudentsByScholarship("scheme b");

        System.out.println("\nStudents under 'no scheme':");
        studentService.displayStudentsByScholarship("no scheme");

        // Delete a student
        System.out.println("\nDeleting student with ID 11:");
        boolean isDeleted = studentService.deleteStudent(11);
        System.out.println(isDeleted);

        // Try displaying the deleted student
        System.out.println("\nStudents under 'scheme a':");
        studentService.displayStudentsByScholarship("scheme a");
    }
}
