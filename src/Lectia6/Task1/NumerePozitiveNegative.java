package Lectia6.Task1;

public class NumerePozitiveNegative {
   public int inputNumar;
   static boolean isPositive;
   static boolean isNegative;

   public  NumerePozitiveNegative(int inputNumar){
        this.inputNumar = inputNumar;
       }

   public boolean checkPositive(){
         isPositive = inputNumar < 0 ? false : true;
        return isPositive;
        }
   public  boolean checkNegative(){
        isNegative = inputNumar < 0 ? true : false;
         return isNegative;
        }

}
