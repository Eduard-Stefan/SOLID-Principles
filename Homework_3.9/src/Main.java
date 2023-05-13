public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double circleArea = circle.getArea();
        System.out.println("Circle area: " + circleArea);

        Square square = new Square(4);
        double squareArea = square.getArea();
        System.out.println("Square area: " + squareArea);

        Rectangle rectangle = new Rectangle(3, 6);
        double rectangleArea = rectangle.getArea();
        System.out.println("Rectangle area: " + rectangleArea);
    }
}