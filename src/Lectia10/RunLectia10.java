package Lectia10;

public class RunLectia10{
    public static void main(String[] args) {
    Animal elefant = new Elefant();
    elefant.greutate();
    elefant.numPicoare();
    elefant.merge();
    elefant.lungime();

    Erbivor elefant1 = new Erbivor() {
        @Override
        public void traeste() {
            System.out.println("Elefantul1 traeste in Savana");
        }

        @Override
        public void greutate() {
            System.out.println("Elefantul1 nu lam cintarit");
        }

        @Override
        public void lungime() {
            System.out.println("Elefantul1 are o lungime de 3.5 metri");
        }

        @Override
        public void numPicoare() {
            System.out.println("Elefantul1 are 4 picioare");
        }
    };

        elefant1.traeste();
        elefant1.greutate();
        elefant1.lungime();
        elefant1.numPicoare();
        elefant1.iarba();
    }
}
