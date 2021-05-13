package za.ac.cput;

/**
 * Na'eem Mahoney
 * 218190751
 * ADP372S
 * Assignment 2
 */

public class StudentMap {
    private int studentNumber;
    private String studentFirstName, studentLastName, studentStream;

    public StudentMap(int studentNumber, String studentFirstName, String studentLastName, String studentStream) {
        this.studentNumber = studentNumber;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentStream = studentStream;
    }

    //Getter and Setter for studentNumber
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    //Getter and Setter for studentFirstName
    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    //Getter and Setter for studentLastName
    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    //Getter and Setter for studentStream
    public String getStudentStream() {
        return studentStream;
    }

    public void setStudentStream(String studentStream) {
        this.studentStream = studentStream;
    }

    @Override
    public String toString() {
        return "StudentMap{" +
                "studentNumber=" + studentNumber +
                ", studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentStream='" + studentStream + '\'' +
                '}';
    }
}
