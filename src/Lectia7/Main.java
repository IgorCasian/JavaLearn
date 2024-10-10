package Lectia7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("=========== Lectia 7. Task 1 ==============");
        System.out.println("===========================================");
        System.out.println(" Declarați un array de tip int. Alocați memorie pentru acest array și inițializați-l cu diferite valori numerice.\n" +
                "Afișați elementele array-ului la consolă.");
        System.out.println("===========================================");
        int[] arrayTask1 = new int[10];
        Random  rand = new Random();  ;

        for(int i=0;i<arrayTask1.length;i++) {
            arrayTask1[i] = rand.nextInt(0, 100);
            System.out.println(arrayTask1[i]);
        }
        System.out.println();
        System.out.println("=========== Lectia 7. Task 2 ==============");
        System.out.println("===========================================");
        System.out.println(" Realizați un program Java care ar calcula suma și media elementelor unui array unidimensional și a unui\n" +
                             "array bidimensional de tip int, numărul elementelor pare și impare.");
        System.out.println("===========================================");
        int NUMARELEMENTE = 10;
        int[] arrayUni = new int[NUMARELEMENTE];
        int[][] arrayBi = new int[NUMARELEMENTE][NUMARELEMENTE];
        int sumaUni = 0;
        int sumaBi = 0;

        double mediaUni =0;
        double mediaBi =0;

        int numPar = 0;
        int numarInpar = 0;

        for(int i=0;i<arrayUni.length;i++) {
            arrayUni[i] = rand.nextInt(0, 100);
            sumaUni += arrayUni[i];
            if (arrayUni[i]%2 == 0) {
                numPar++;
            }
            else {
                numarInpar++;
            }
        }
        mediaUni=(double)sumaUni/NUMARELEMENTE;
        System.out.println("Suma array unidimensional este: " +sumaUni);
        System.out.println("Media array unidimensional este: " +mediaUni);
        System.out.println("Numere pare: " +numPar);
        System.out.println("numere inpare: " +numarInpar);

        for(int i=0;i<arrayBi.length;i++) {
            for(int l=0;i<NUMARELEMENTE;i++) {
                arrayBi[i][l] = rand.nextInt(0, 100);
                sumaBi+=arrayBi[i][l];
                if (arrayBi[i][l]%2 == 0) {
                    numPar++;
                }
                else {
                    numarInpar++;
                }

            }
        }
        mediaBi=(double)sumaBi/(NUMARELEMENTE*NUMARELEMENTE);
        System.out.println("Suma array Bidiminsional este: " +sumaBi);
        System.out.println("Media array Bidiminsional este: " +mediaBi);
        System.out.println("Numere pare: " +numPar);
        System.out.println("numere inpare: " +numarInpar);

        System.out.println();
        System.out.println("=========== Lectia 7. Task 3 ==============");
        System.out.println("===========================================");
        System.out.println(" Realizați un program Java pentru a copia elementele unui array într-un alt array.");
        System.out.println("===========================================");

        int[] arrayPrimar = new int[NUMARELEMENTE];
        int[] arrayCopy = new int[NUMARELEMENTE];

        //initializarea array

        for(int i=0;i<arrayPrimar.length;i++) {
            arrayPrimar[i] = rand.nextInt(0, 100);
            System.out.println(arrayPrimar[i]);
        }
        System.out.println("===========");
       //prima metoda fiecare elemen
//        for ( int i=0;i<arrayPrimar.length;i++) {
//            arrayCopy[i] = arrayPrimar[i];
//            System.out.println(arrayCopy[i]);
//        }
        arrayCopy = arrayPrimar;

        for ( int i=0;i<arrayCopy.length;i++) {
            System.out.println(arrayCopy[i]);
        }


    }
}
