package github.com;

/**
 * Created by DimaN228 on 28.09.2017.
 */
public class RectangleArea extends Shape{
    private final double a;
    private final double b;

    public double getA() {
        return a;
    }

    public RectangleArea(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea(){
        return a * b;
    }

    @Override
    public String toString(){
        return "Rectangle:" + " a = " + a + " b = " + b;
    }
}
