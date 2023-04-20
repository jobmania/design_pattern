package _02.ch07;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println(Employee.getSerialNum()); // 클래스 생성과 상관없이 접근 가능.
        Employee employee1 = new Employee();
        employee1.setEmployeeName("엄준식");

//        System.out.println(Employee.serialNum);

        Employee employee2 = new Employee();
        employee1.setEmployeeName("무자식");

//        System.out.println(Employee.serialNum);
//        System.out.println(Employee.serialNum);
        System.out.println(Employee.getSerialNum()); // 클래스 이름으로 접근.

        System.out.println(employee1.getEmployeeId());
        System.out.println(employee2.getEmployeeId());




    }
}
