package manager2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MaterialManager{
    private List<Material> materialList ;

    public MaterialManager() {
    }

    public MaterialManager(List<Material> materialList) {
        this.materialList = materialList;
    }

    public List<Material> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<Material> materialList) {
        this.materialList = materialList;
    }
    public void addMaterial(Material material){
        materialList.add(material);
    }
    public void deleteMaterial(Material material){
        materialList.remove(material);
    }
    public void disPlayMaterial(){
        for (Material a : materialList ){
            System.out.println(a);
        }
    }


    public double getRealMoneyOfMeat() {
        double realMoney = 0;
        for(Material material: materialList){
            if(material instanceof Meat){
                realMoney += ((Meat) material).getRealMoney();
            }
        }
        return realMoney;
    }

    public double getRealMoneyOfCrispyFlour() {
        double realMoney = 0;
        for(Material material: materialList){
            if(material instanceof CrispyFlour){
                realMoney += ((CrispyFlour) material).getRealMoney();
            }
        }
        return realMoney;
    }
}
