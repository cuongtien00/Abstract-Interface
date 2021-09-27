package Resize;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5, "red", true);
        shapes[1] = new Rectangle(5, 8, "yellow", false);

        System.out.println("Dien tich truoc khi tang");

        for (Shape a : shapes) {
            if (a instanceof Circle) {
                System.out.println("Area of Circle " + ((Circle) a).getArea());
                ((Circle) a).resize(5);
            } else {
                System.out.println("Area of Rectangle " + ((Rectangle) a).getArea());
                ((Rectangle) a).resize(8);
            }

        }
        System.out.println("Dien tich sau khi tang");
        for (Shape a : shapes) {
            if (a instanceof Circle) {
                System.out.println("Area of Circle " + ((Circle) a).getArea());
            } else {
                System.out.println("Area of Rectangle " + ((Rectangle) a).getArea());
            }

        }
    }
}
