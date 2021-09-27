package manager2;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }
    public double getAmount(){
        return quantity*cost;
    }
    public LocalDate getExpiryDate(){
        LocalDate expiryDate = manufacturingDate.ofEpochDay(365);
        return expiryDate;
    }


    @Override
    public double getRealMoney() {
        LocalDate today = LocalDate.now();
        if(this.getExpiryDate().isAfter(today.plusDays(60))){
            return this.getAmount()- this.getAmount()*0.4;
        }
        else if (this.getExpiryDate().isAfter(today.plusDays(120))){
            return this.getAmount()- this.getAmount()*0.2;
        }
        else{
            return this.getAmount()- this.getAmount()*0.05;
        }
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                '}';
    }
}
