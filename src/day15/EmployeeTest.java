package day15;

public class EmployeeTest {
    public static void main(String[] args) {
        // 多肽
        Employee manager = new Manager("库克",1000,10,10);
        manager.work();
        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();


    }
}
