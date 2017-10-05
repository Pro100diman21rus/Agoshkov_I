package github.com;


/**
 * Created by DimaN228 on 28.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        CircleArea circle = new CircleArea(10);
        SquareArea square = new SquareArea(5);
        RectangleArea rect = new RectangleArea(12, 3);

        Shape[] shapes =  {circle, square, rect};
        printArrayElements(shapes);

        for (Shape shape : shapes)
            System.out.println(shape.getArea());
    }

    private static void printArrayElements(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(i + ":" + objects[i]);
        }

    }
}
