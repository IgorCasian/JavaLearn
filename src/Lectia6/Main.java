package Lectia6;

import Lectia6.Task1.NumerePozitiveNegative;
import Lectia6.Task2.DivisibeleCinciSase;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("=========== Lectia 6. Task 1 ==============");
        System.out.println("===========================================");
        System.out.println("Creați un program care citește un număr nespecificat de numere întregi de la tastatură. Citirea numerelor\n" +
                           "se încheie imediat ce utilizatorul introduce cifra 0 (zero). Determinați câte valori din cele introduse sunt\n" +
                            "pozitive și câte sunt negative, de asemenea calculați suma totală. Afișați rezultatul la consolă.");
        System.out.println("===========================================");


        Scanner inputNumber = new Scanner(System.in);
        int userNumber;
        int countPositive = 0;
        int countNegative = 0;
        int sumaPozNegativ =0;
        String mesaj = "Ati introdus numere";

        if (inputNumber.hasNextInt())
          {
        userNumber = inputNumber.nextInt();
        while (userNumber !=0) {
            NumerePozitiveNegative inputNamber = new NumerePozitiveNegative(userNumber);
            if (inputNamber.checkPositive()) {
                countPositive++;

            } else if (inputNamber.checkNegative()) {
                countNegative++;
            } else {
                mesaj = "Nu pot deternina ce ati introdus";
            }
            sumaPozNegativ =sumaPozNegativ + userNumber;
            System.out.println("Introduceti urmatorul numar");

            if (inputNumber.hasNextInt()) {
                userNumber = inputNumber.nextInt();
            }
            else {
                System.out.println("Fiti mai atent introduceti numere intregi!!!");
                userNumber = 0;
                break;
            }
           } // while (userNumber !=0)
           System.out.println(mesaj+" pozitive->"+countPositive + ";  negative->" + countNegative);
              System.out.println("Suma numerilor este: " + sumaPozNegativ );
         } // if
        else {
            System.out.println("Fiti mai atent introduceti numere intregi!!!");
            }
        inputNumber.close();

        //****************************Task 2*****************************************************
        System.out.println("===========================================");
        System.out.println("=========== Lectia 6. Task 2 ==============");
        System.out.println("===========================================");
        System.out.println("Creați un program care afișează toate numerele de la 100 la 1.000, câte zece pe linie,\n" +
                           "care sunt divizibile cu 5 și 6. Numerele sunt separate de exact un spațiu.");
        System.out.println("===========================================");
        int k=0;

        for (int i=100; i<=1000;i++){
            DivisibeleCinciSase divisibeleCinciSase = new DivisibeleCinciSase(i);

                if (divisibeleCinciSase.checkDivCinci() || divisibeleCinciSase.checkDivSase()) {
                    System.out.print(i + " ");
                    k++;
                }
                if (k>9) {
                    k = 0;
                    System.out.println();
                }
        }
//****************************Task 3*****************************************************
        System.out.println("===========================================");
        System.out.println("=========== Lectia 6. Task 3 ==============");
        System.out.println("===========================================");
        System.out.println(" Creați un program pentru a suma următoarele serii:\n" +
                       "1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99");
        System.out.println("===========================================");
        double suma = 0.0d;

        for (int i=1;i<=97;i=i+2)
        {
         suma = suma + (double) i/(i+2) ;
        }
        System.out.println("Suma sirului este: " + suma);


    } //main
} //class main

