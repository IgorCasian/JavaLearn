package Lectia9.Task3;

public class RunTask3 {
    public static void main(String[] args) {
        Circle circle = new Circle(3.6);
        Square square = new Square(6.8);

        Sphere sphere  = new Sphere(7.0);
        Cube   cube    = new Cube(8.6);

        System.out.println("Aria cercului "+circle.aria());
        System.out.println("Aria aria patratului "+square.aria());

        System.out.println("Aria Sferei: "+sphere.aria() + " Volumul " + sphere.volumul());
        System.out.println("Aria Cubului: "+cube.aria() + " Volumul " + cube.volumul());

    }
}
