package aplicacionfecha;

import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anyo;
    
    static Scanner sc=new Scanner(System.in);
public Fecha(){

}

public Fecha(int dia, int mes, int anyo){
    this.dia = dia;
    this.mes = mes;
    this.anyo = anyo;
    
}

public static Fecha pideFecha(){
    Fecha f;
    String cadena;
    boolean correcto=false;
    String sDia="", sMes="", sAnyo="";
    int dia=0, mes=0, anyo=0;
    do{
        System.out.print("Fecha (DD/MM/AAAA): ");cadena=sc.nextLine();
     
        if(cadena.length()==10)correcto=true;
        if(correcto){
            if (cadena.charAt(2)=='/' && cadena.charAt(5)=='/') correcto=true;
            else correcto=false;
        }
        if (correcto){
            sDia=cadena.substring(0,2);
            sMes=cadena.substring(3,5);
            sAnyo=cadena.substring(6,10);
            String s=sDia+sMes+sAnyo;
            for(int i=0;i<8;i++){
                if(s.charAt(i)>='0' && s.charAt(i)<='9') correcto=true;
                else {
                    correcto=false;
                    break;
                }
            }
            dia=Integer.parseInt(sDia);
            mes=Integer.parseInt(sMes);
            anyo=Integer.parseInt(sAnyo);
        }
    if (correcto=true){
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (dia<1 || dia>31) correcto=false;
                break;
            case 2:
                int diamax=28;
                if ((anyo%4==0) && (anyo%100!=0 || anyo%400==0)) diamax=29;
                if (dia<1 || dia>diamax) correcto=false;
                break;
                case 4: case 6: case 9: case 11:
                if (dia<1 || dia>30) correcto=false;
                break;
            default:
                correcto=false;
        }
    }
    }while(!correcto);
    f=new Fecha(dia,mes,anyo);
    return f;
}

    @Override
    public String toString(){
        return "Fecha:" + dia + "/" + mes + "/" + anyo;
}








//sets y gets
    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the anyo
     */
    public int getAnyo() {
        return anyo;
    }

    /**
     * @param anyo the anyo to set
     */
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    
    
}
