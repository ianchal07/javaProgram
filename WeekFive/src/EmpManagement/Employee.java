package EmpManagement;

import java.io.Serializable;

public class Employee implements Serializable{
    int empId;
    String empName;
    int salary;

    public  Employee(int empId, String empName, int salary) {

        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee Id:"+ empId+" Name :"+empName+" Salary :"+salary;
    }

}
