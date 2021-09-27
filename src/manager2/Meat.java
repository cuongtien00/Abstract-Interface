package manager2;

import java.time.LocalDate;

public class Meat extends Material implements Discount {
    double weight;

    public Meat() {
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getAmount() {
        return cost * weight;
    }


    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        LocalDate today = LocalDate.now();
        if(this.getExpiryDate().isAfter(today.plusDays(3))){
            return   this.getAmount()-this.getAmount()*0.5;
        }
        else if (this.getExpiryDate().isAfter(today.plusDays(5))){
            return this.getAmount()-this.getAmount()*0.3;
        }
        else {
            return this.getAmount()-this.getAmount()*0.1;
        }

    }

    @Override
    public String toString() {
        return "Meat{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                ", weight=" + weight +
                '}';
    }
}
