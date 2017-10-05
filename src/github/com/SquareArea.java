package github.com;

/**
 * Created by DimaN228 on 28.09.2017.
 */
public class SquareArea extends Shape{
    private final double size;

    public double getSize() {
        return size;
    }

    public SquareArea(double size) {
        this.size = size;
    }

    @Override
    public double getArea(){
        return size * size;
    }

    @Override
    public String toString(){
        return "Square:" + " size = " + size;
    }
}
