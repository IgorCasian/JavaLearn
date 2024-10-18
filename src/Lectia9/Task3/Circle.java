package Lectia9.Task3;

public class Circle extends TwoDimensionalShape{
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }
    @Override
    public double aria(){
        return radius*radius*3.14;
    }

}
