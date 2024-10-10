package Lectia8;

import Lectia8.Task1.Employee;
import Lectia8.Task2.Invoice;
import Lectia8.Task3.Date;

import java.util.Scanner;

public interface Main {
    public static void main(String[] args) {

        System.out.println("=========== Lectia 8. Task 1 ==============");
        System.out.println("===========================================");
        System.out.println(" Definiți o clasă cu denumirea Employee. Adăugați 3 membri: name, age și department de tip\n" +
                "String, int și String. Marcați membrii cu modificatorul de acces private. Furnizați un constructor cu\n" +
                "3 parametri și metode getter/setter pentru fiecare membru. Scopul exercițiului este să creați o\n" +
                "clasă bine încapsulată..");
        System.out.println("===========================================");

        Employee  rsHuman = new Employee();
        rsHuman.setHuman("Igor Casian",48,"Tehnologii Informationale");
        rsHuman.getHuman();

        System.out.println("===========================================");
        System.out.println("=========== Lectia 8. Task 2 ==============");
        System.out.println("===========================================");
        System.out.println("Creați o clasă cu denumirea Invoice care ar reprezenta factura eliberată de un magazin la\n" +
                "procurarea unui aparat electrocasnic. O factură trebuie să conțină următoarele informații:\n" +
                "modelul dispozitivului (String), descrierea produsului (String), cantitatea de produse achiziționate\n" +
                "(int) și prețul pentru un produs (double).\n" +
                "Definiți un constructor care va inițializa atributele clasei Invoice. Adăugați metode setter și getter\n" +
                "pentru fiecare atribut. Implementați o metodă cu denumirea getAmount care va calcula și\n" +
                "întoarce suma facturei ca o valoare de tip double.\n" +
                "Atunci când cantitatea produselor specificată, fie prin intermediul constructorului sau a metodei\n" +
                "setter, nu reprezintă o valoare pozitivă, variabilei corespunzătoare automat îi se va atribui\n" +
                "valoarea 0 (zero). Similar se va proceda și în cazul valorii pentru preț, dacă acesta nu reprezintă\n" +
                "o valoarea pozitivă, variabilei îi va fi atribuită valoarea 0.0.\n" +
                "Creați un obiect de tipul clasei Invoice. Inițializați atributele necesare și apelați metoda\n" +
                "getAmount. Asigurați-vă că rezultatul returnat este corect.");
        System.out.println("===========================================");

        Invoice depInvoice = new Invoice();
        depInvoice.setModelDispozitiv("Piva");
        depInvoice.setDescriere("Foarte buna");
        depInvoice.setCantitatea(10);
        depInvoice.setPretul(18.50);

        System.out.println("Invoice Nr 2 ");
        System.out.println("Din 11.10.2024");
        System.out.println("Model dispozitiv: " + depInvoice.getModelDispozitiv());
        System.out.println("Cantitatea:" + depInvoice.getCantitatea());
        System.out.println("Pret: " + depInvoice.getPretul());
        System.out.println("Total spre achitare: " + depInvoice.getAmount());

        System.out.println("===========================================");
        System.out.println("=========== Lectia 8. Task 3 ==============");
        System.out.println("===========================================");
        System.out.println("Creați o clasă cu denumirea Date care va reprezenta o dată calendaristică. Clasa va conține 3\n" +
                "atribute care vor stoca valoarea pentru zi, lună și an. Aplicați principiul de încapsulare asupra\n" +
                "acestei clase. Fiecare metodă setter atunci când va fi apelată, trebuie să valideze corectitudinea\n" +
                "valorii care urmează a fi atribuită variabilei, de ex. valoarea pentru lună trebuie să fie definită în\n" +
                "intervalul 0-12.\n" +
                "Adăugați o metodă cu denumirea displayDate care va afișa data calendaristică la ecran în\n" +
                "formatul următor: zi/lună/an.\n" +
                "Creați un obiect de tipul clasei Date. Utilizați metodele setter pentru a inițializa atributele clasei.\n" +
                "Afișați data calendaristică la consolă.");
        System.out.println("===========================================");

       Date newDate = new Date();
       newDate.setZi(3);
       newDate.setLuna(6);
       newDate.setAnul(1976);

        System.out.println("Data in formatul zi/Luna/anul: " + newDate.displayDate());
        Scanner inputZi = new Scanner(System.in);
        Scanner inputLuna = new Scanner(System.in);
        Scanner inputAnul = new Scanner(System.in);

        System.out.println("Introducezi ziua: ");
        newDate.setZi(inputZi.nextInt());
        System.out.println("Introducezi Luna: ");
        newDate.setLuna(inputLuna.nextInt());
        System.out.println("Introducezi Anul: ");
        newDate.setAnul(inputAnul.nextInt());


        System.out.println("Ati intodus data (zi/Luna/anul): " + newDate.displayDate());



    }
}
