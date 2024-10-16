package Lectia9.Task3;

public class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    public double aria(){
        return side*side;
    }

}
