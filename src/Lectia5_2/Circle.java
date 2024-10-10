package Lectia5_2;

public class Circle {

    public Double radius ;

    public Circle ( Double radius){
        this.radius = radius;
    }

    public double  calculateAria() {
        radius =  3.14*(radius*radius);
        return radius;

    }

}



