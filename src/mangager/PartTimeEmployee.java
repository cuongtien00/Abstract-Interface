package mangager;

public class NhanVienPartTime extends NhanVien {
    private double jobTime;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(String code, String name, int age, String phoneNum, String email, double jobTime) {
        super(code, name, age, phoneNum, email);
        this.jobTime = jobTime;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", jobTime=" + jobTime +
                '}';
    }
}
