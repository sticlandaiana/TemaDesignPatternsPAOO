public class Main {
    public static void main(String[] args) {
        Shape rectangle = Factory.createGeometricShape(4.0f, 5.0f);
        System.out.println("The area of the rectangle = "+rectangle.getArea());

        Shape circle = Factory.createGeometricShape(1.0f);
        System.out.println("The are of the circle = "+circle.getArea());

    }
}