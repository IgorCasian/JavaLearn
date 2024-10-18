package Lectia10;

public class Elefant implements Animal{
    @Override
    public void greutate() {
        System.out.println("Elefantul cintareste mult");
    }

    @Override
    public void lungime() {
        System.out.println("Elefantul are o lunguime mare");
    }

//    @Override
//    public void merge() {
//        System.out.println("Elefantul merge incet");
//    }

    @Override
    public void numPicoare() {
        System.out.println("Numarul de picioare 4");
    }
}
