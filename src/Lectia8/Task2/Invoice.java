package Lectia8.Task2;

public class Invoice {
    private String modelDispozitiv;
    private String descriere;
    private Integer cantitatea;
    private double pretul;

    public void setModelDispozitiv(String modelDispozitiv){
        this.modelDispozitiv = modelDispozitiv;
    }

    public void setDescriere(String descriere){
        this.descriere = descriere;
    }

    public void setCantitatea(Integer cantitatea){
        if (cantitatea>0) {
            this.cantitatea = cantitatea;
            }
        else this.cantitatea = 0;
    }

    public void setPretul(double pretul)
    {
        if (pretul>0) {
            this.pretul = pretul;
        }
        else this.pretul = 0.0;
    }

    public String getModelDispozitiv() {
        return modelDispozitiv;
    }

    public Integer getCantitatea() {
        return cantitatea;
    }

    public double getPretul() {
        return pretul;
    }

    public double getAmount(){
        return (pretul*cantitatea);

    }

}
