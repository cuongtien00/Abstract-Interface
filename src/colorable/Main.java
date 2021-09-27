package colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, "red", true);
        shapes[1] = new Rectangle( "yellow", false,5, 8);
        shapes[2] = new Square( "yellow", false,5);


        for (Shape a : shapes) {
            if (a instanceof Circle) {
                System.out.println("Area of Circle " + ((Circle) a).getArea());
                ((Circle) a).resize(5);
            }
            else if(a instanceof Square){
                System.out.println("Area of Square " + ((Square)a).getArea());
                ((Square)a).howToColor();
            }
            else {
                System.out.println("Area of Rectangle " + ((Rectangle) a).getArea());

            }

        }

    }
}
