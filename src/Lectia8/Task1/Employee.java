package Lectia8.Task1;

public class Employee {

    private String name;
    private Integer age;
    private String department;

    public void setHuman(String name,Integer age,String department) {
        this.name =  name;
        this.age = age;
        this.department = department;
    }

    public void getHuman() {
        System.out.println("Name:" +name+" Age:"+age+" Department:" + department );
    }

}
