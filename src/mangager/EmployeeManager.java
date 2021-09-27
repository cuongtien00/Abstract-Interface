package mangager;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
  private   List<Employee> employeeList;

    public EmployeeManager() {
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    public void disPlayEmployee(){
        System.out.println("Danh sach NV");
        for (Employee a:employeeList) {
            System.out.println(a);
        }
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
        disPlayEmployee();
    }
    public void displayFullTimeEmployee(){
        double totalSalary = 0;
        List<FullTimeEmployee> fullTimeEmployeeList = new ArrayList<>();
        for (Employee employee:employeeList) {
            totalSalary +=employee.getSalary();
        }
        System.out.println("Muc luong trung binh ");
        double avg = totalSalary/employeeList.size();
        System.out.println(avg);
        for (Employee employee : employeeList){
            if(employee instanceof FullTimeEmployee && employee.getSalary()<avg){
                fullTimeEmployeeList.add((FullTimeEmployee) employee);
            }
        }
        for (FullTimeEmployee a: fullTimeEmployeeList) {
            System.out.println(a);
        }
    }
    public void sumSalaryPartTimeEmployee(){
        double total = 0;
        for (Employee employee: employeeList ){
            if (employee instanceof PartTimeEmployee){
                total += employee.getSalary();
            }
        }
        System.out.println("Tong so luong phai tra cho tat ca nhien vien Parttime la " + total);
    }
    public void sortEmployee(){
        List<FullTimeEmployee> fullTimeEmployeeList = new ArrayList<>();
        for (Employee employee : employeeList){
            if(employee instanceof FullTimeEmployee){
                fullTimeEmployeeList.add((FullTimeEmployee) employee);
            }
        }
        for (int i = 0; i < fullTimeEmployeeList.size(); i++) {
            for (int j = 0; j < fullTimeEmployeeList.size()-1; j++) {
                if(fullTimeEmployeeList.get(j).getSalary()>fullTimeEmployeeList.get(j+1).getSalary()){
                    FullTimeEmployee temp = fullTimeEmployeeList.get(j);
                    fullTimeEmployeeList.set(j,fullTimeEmployeeList.get(j+1)) ;
                    fullTimeEmployeeList.set(j+1,temp);
                }
            }
        }
        System.out.println("Danh sach fulltime employee sau khi sap xep luong tang dan");
        for (FullTimeEmployee fulltimeemployee:fullTimeEmployeeList ){
            System.out.println(fulltimeemployee);
        }
    }
}
