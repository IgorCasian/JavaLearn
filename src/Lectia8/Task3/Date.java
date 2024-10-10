package Lectia8.Task3;

public class Date {
    private Integer zi;
    private Integer luna;
    private Integer anul;

    public void setZi(Integer zi) {
        if (zi>=1 && zi<=31){
            this.zi = zi;
        }
        else {
            throw new IllegalArgumentException("Ziua trebuie sa fie intre 1 si 31");
        }
    }

    public void setLuna(Integer luna) {
        if (luna>=1 && luna<=12) {
            this.luna = luna;
        }
        else{
            throw new IllegalArgumentException("Luna trebuie sa fie intre 1 si 12");
        }
    }

    public void setAnul(Integer anul) {
        if (anul>=1000) {
            this.anul = anul;
        }
        else {
            new IllegalArgumentException("Anul trebuie sa fiie mai mare ca 1000");
        }
        }

    public Integer getZi() {
        return zi;
    }
    public Integer getLuna() {
        return luna;
    }
    public Integer getAnul() {
        return anul;
    }

    public String displayDate(){
        return (zi+"/"+luna+"/"+anul);
    }
}
