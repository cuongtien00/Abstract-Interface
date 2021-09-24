package animalsAndInterfaceEdible;

public class Main {
    public static void main(String[] args) {
        Main.testSound();
        testEdible();
    }
    public static void testSound(){
        Animal [] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal a: animals){
            System.out.println(a.makeSound());
            if(a instanceof Chicken){
                Edible edible = (Chicken) a;
                System.out.println(edible.howToEat());
            }
        }

    }
    public static void testEdible(){
        Fruit [] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for(Fruit a: fruit){
            System.out.println(a.howToEat());
        }

    }
}
