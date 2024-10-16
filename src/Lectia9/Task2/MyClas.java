package Lectia9.Task2;

public class MyClas {
    public static void main(String[] args) {
        Parallelogram newParallelogram = new Parallelogram();

        int length = 15;
        int width = 60;
        int perimeter = newParallelogram.calculatePerimeter(length, width);
        double area = newParallelogram.calculateArea(length, width);

        System.out.println("Perimetrul paralelogramului  este : " + perimeter);
        System.out.println("Aria paralelogramului : " + area);


        int sideLength = 35;
        int perimeter1 = newParallelogram.calculatePerimeter(sideLength);
        int area2 = newParallelogram.calculateArea(sideLength);

        System.out.println("Perimetrul pătratului este :" + perimeter1);
        System.out.println("Aria pătratului este: " + area2);
    }

}
