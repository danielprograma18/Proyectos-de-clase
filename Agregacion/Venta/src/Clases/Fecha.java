package Clases;

public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha () {
        
    }
     public int getAño () {
        return año;
     }

     public void setAño (int val) {
        this.año = val;
     }

    public int getDia (){
        return dia;
    }
    public void setDia (int val) {
        this.dia = val;
    }

    public int getMes (){
    return mes;
    }
    public void setMes (int val){
        this.mes = val;

    }
    public Fecha(int d, int m, int a){
        setDia(d);
        setMes(m);
        setAño(a);
        }

}
