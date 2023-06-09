package _02.ch07;

public class Employee {
    private static int serialNum= 1000;
    private int employeeId;
    private String employeeName;
    private String department;

    public Employee(){
        employeeId = ++serialNum; //  + 증가후 적용
    }

    public int getEmployeeId() {
        return employeeId;
    }


    public static int getSerialNum() {
        int i = 0 ;

        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Employee.serialNum = serialNum;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
