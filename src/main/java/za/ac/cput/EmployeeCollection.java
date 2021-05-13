package za.ac.cput;

/**
 * Na'eem Mahoney
 * 218190751
 * ADP372S
 * Assignment 2
 */

public class EmployeeCollection {
    private int employeeNum;
    private String employeeFirstName, getEmployeeLastName;

    public EmployeeCollection(int employeeNum, String employeeFirstName, String getEmployeeLastName) {
        this.employeeNum = employeeNum;
        this.employeeFirstName = employeeFirstName;
        this.getEmployeeLastName = getEmployeeLastName;
    }

    //Getter and Setter for employeeNum
    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    //Getter and Setter for employeeFirstName
    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    //Getter and Setter for employeeLastName
    public String getGetEmployeeLastName() {
        return getEmployeeLastName;
    }

    public void setGetEmployeeLastName(String getEmployeeLastName) {
        this.getEmployeeLastName = getEmployeeLastName;
    }

    @Override
    public String toString() {
        return "EmployeeCollection{" +
                "employeeNum=" + employeeNum +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", getEmployeeLastName='" + getEmployeeLastName + '\'' +
                '}';
    }

}
