package Lectia10;

public abstract class Erbivor extends Elefant  implements  Animal{
    public void iarba(){
        System.out.println("Maninaca numai iarba");
    }
    public void plante(){
        System.out.println("Maninaca numai plante");
    }
    public abstract void  traeste();
}
