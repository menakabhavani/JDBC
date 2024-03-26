// Student.java

public class student {
    // Private member variables
    private String studentName;
    private String collegeName;
    private int studentID;

    // Constructor
    public student(String studentName, String collegeName, int studentID) {
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.studentID = studentID;
    }

    // Getter methods
    public String getstudentName() {
        return studentName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getstudentID() {
        return studentID;
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Successful");
    }
}
