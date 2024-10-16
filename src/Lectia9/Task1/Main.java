package Lectia9.Task1;

public class Main {
    public static void main(String[] args) {
        Person newPerson = new Person("New Person", "str. Chisinau");
        Student newStudent = new Student("New Person Student", "str. Cocorilor", "C++", 1, 1500.00);
        Staff newStaff = new Staff("New Person Staff", "Ocnita", "Birnova", 50000.00);

        System.out.println(newPerson);
        System.out.println(newStudent);
        System.out.println(newStaff);
    }
}
