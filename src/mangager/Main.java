package mangager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee = new FullTimeEmployee("C1","Cuong",21,"123","@1",100,20,5000);
        Employee employee2 = new FullTimeEmployee("C2","Long",21,"456","@2",50,10,2000);
        Employee employee3 = new PartTimeEmployee("C3","Huyen",19,"789","@3",28);
        Employee employee4 = new PartTimeEmployee("C4","Dung",21,"589","@4",30);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.setEmployeeList(employeeList);
//        employeeManager.disPlayEmployee();
//        employeeManager.displayFullTimeEmployee();
//        employeeManager.sumSalaryPartTimeEmployee();
//        employeeManager.sortEmployee();
//        employeeManager.addEmployee(employee);

    }
}
