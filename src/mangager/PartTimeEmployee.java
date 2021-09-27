package mangager;

public class PartTimeEmployee extends Employee {
    private int hours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String code, String name, int age, String phoneNum, String email, int hours) {
        super(code, name, age, phoneNum, email);
        this.hours = hours;
    }

    @Override
    public int getSalary() {
        return hours*100 ;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", jobTime=" + hours +
                '}';
    }
}
