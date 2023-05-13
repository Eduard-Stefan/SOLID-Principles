import java.util.ArrayList;

public class sumAreas {
    public static void main(String[] args) {
        ArrayList<Shape> shapesList = new ArrayList<>();

        shapesList.add(new Circle(2));
        shapesList.add(new Rectangle(1, 3));
        shapesList.add(new Circle(1));

        double totalArea = computeTotalArea(shapesList);

        System.out.println("Total Area: " + totalArea);
    }

    private static double computeTotalArea(ArrayList<Shape> shapesList) {
        double totalArea = 0;

        for (Shape shape : shapesList) {
            System.out.println("Area " + shape.getClass().getSimpleName() + ": " + shape.getArea());
            totalArea += shape.getArea();
        }

        return totalArea;
    }
}
