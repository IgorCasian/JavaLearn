package Lectia10;

public interface Animal {
    void greutate();
    void lungime();
    void numPicoare();

    default void merge() {
        System.out.println("Merge  " +sunet());
    }

    static String sunet(){
        return "Mut";
    }


}
