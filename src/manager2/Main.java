package manager2;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Material material = new Meat("1","Lon Bac Kan", LocalDate.of(2021,9,24),80,10);
        Material material2 = new Meat("2","Lon Yen Bai", LocalDate.of(2021,9,22),85,15);
        Material material3 = new CrispyFlour("3","Bot chien ajiquick", LocalDate.of(2020,6,25),10,2);
        Material material4 = new CrispyFlour("4","Bot chien vifont", LocalDate.of(2020,3,15),11,3);
        List<Material> materialList = new ArrayList<>();
        materialList.add(material);
        materialList.add(material2);
        materialList.add(material3);
        materialList.add(material4);
        MaterialManager materialManager = new MaterialManager();
        materialManager.setMaterialList(materialList);

        System.out.println(materialManager.getRealMoneyOfMeat());

        System.out.println(materialManager.getRealMoneyOfCrispyFlour());

        materialManager.deleteMaterial(material2);
        materialManager.disPlayMaterial();

    }
}
