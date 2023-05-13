public class Main {
    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new ShapeDrawer();
        Shape circle = new Circle();
        shapeDrawer.draw(circle);
    }
}