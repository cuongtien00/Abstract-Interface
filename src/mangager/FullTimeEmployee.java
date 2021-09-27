package mangager;

public class FullTimeEmployee extends Employee {
    private int bonus;
    private int fine;
    private int salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String code, String name, int age, String phoneNum, String email, int bonus, int fine, int salary) {
        super(code, name, age, phoneNum, email);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary+bonus-fine;
    }

    @Override
    public String toString() {
        return "NhanVienFullTime{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", bonus=" + bonus +
                ", fine=" + fine +
                ", salary=" + salary +
                '}';
    }
}
