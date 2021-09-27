package mangager;

public class NhanVienFullTime extends NhanVien{
    private int bonus;
    private int fine;
    private int salary;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(String code, String name, int age, String phoneNum, String email, int bonus, int fine, int salary) {
        super(code, name, age, phoneNum, email);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
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
