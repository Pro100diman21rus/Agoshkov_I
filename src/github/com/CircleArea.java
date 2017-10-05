package github.com;

/**
 * Created by DimaN228 on 28.09.2017.
 */
public class CircleArea extends Shape{
    private final double rad;

    public CircleArea(double rad){
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    @Override
    public double getArea(){
        return Math.PI * rad * rad;
    }

    @Override
    public String toString(){
        return "Circle:" + " radius = " + rad;
    }
}
