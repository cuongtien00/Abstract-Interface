package animalsAndInterfaceEdible;

public class Chicken extends Animal implements Edible {
    public String makeSound(){
        return "Chicken: kokekoko";
    }
    public String howToEat(){
        return "Luộc lên";
    }
}
