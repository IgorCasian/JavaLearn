package Lectia6.Task2;

public class DivisibeleCinciSase {
   int numar;
   boolean isDivCinci;
   public  DivisibeleCinciSase(int numar) {
       this.numar = numar;
   }

    public boolean checkDivCinci() {
        isDivCinci = ((numar % 5) == 0) ? true : false;
        return isDivCinci;
    }
    public boolean checkDivSase() {
        isDivCinci = ((numar % 6) == 0) ? true : false;
        return isDivCinci;
    }
}
