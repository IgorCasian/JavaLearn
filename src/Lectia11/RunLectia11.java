package Lectia11;

public class RunLectia11 {
    public static void main(String[] args) {
        System.out.println("============== Lectia 11. Polimorfismul ===================");

        Square square = new Square();
//        {
//            @Override
//            public void render() {
//                super.render();
//                System.out.println("Sqguare");
//            }
//        };
        Circle circle =new Circle();
//        {
//            @Override
//            public void render() {
//                super.render();
//                System.out.println("Circle");
//            }
//        };

        Polygon polSquare = new Square()
            {
            @Override
            public void render() {
                super.render();
                System.out.println("   Polygon polSquare = new Square()   ");
                System.out.println("Polimorfism Square");
                              }
            };


        Polygon polCircle = new Circle(){

                @Override
                public void render() {
                super.render();
                System.out.println("    Polygon polCircle = new Circle()   ");
                System.out.println(" Polimorfism Circle");
            }
        };

            System.out.println("Apelam square.render();");
        square.render();
            System.out.println("------------------------------------");
            System.out.println("Apelam circle.render();");
        circle.render();
            System.out.println("------------------------------------");
            System.out.println("Apelam polSquare.render();");
        polSquare.render();
            System.out.println("------------------------------------");
            System.out.println("Apelam polCircle.render();");
        polCircle.render();



    }
}
