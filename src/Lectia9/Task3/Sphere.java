package Lectia9.Task3;

public class Sphere  extends ThreeDimensionalShape{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    public double aria() {
        return 4 * 3.14 * radius * radius;
    }
    @Override
    public double volumul() {
        return (4.0 * 3.14 * radius * radius * radius)/3;
    }

}
