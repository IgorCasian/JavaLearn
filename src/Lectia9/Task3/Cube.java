package Lectia9.Task3;

public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double aria() {
        return 6 * side * side;
    }

    public double volumul() {
        return side * side * side;
    }

}
