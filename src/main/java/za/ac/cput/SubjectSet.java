package za.ac.cput;

public class SubjectSet {
    private int subjectNum;
    private String subjectCode, subjectName, subjectYear;

    public SubjectSet(int subjectNum, String subjectCode, String subjectName, String subjectYear) {
        this.subjectNum = subjectNum;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.subjectYear = subjectYear;
    }

    //Getter and Setter for subjectNum
    public int getSubjectNum() {
        return subjectNum;
    }

    public void setSubjectNum(int subjectNum) {
        this.subjectNum = subjectNum;
    }

    //Getter and Setter for subjectCode
    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    //Getter and Setter for subjectName
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    //Getter and Setter for subjectYear
    public String getSubjectYear() {
        return subjectYear;
    }

    public void setSubjectYear(String subjectYear) {
        this.subjectYear = subjectYear;
    }
}
