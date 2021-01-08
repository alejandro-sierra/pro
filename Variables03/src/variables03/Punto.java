package variables03;

public class Punto {
    double x;
    double y;
    boolean toString;
    public String toString(){
    String r;
    r = "(" + x + ", " + y + ")";
    return r;
}    
public void cambiaPunto(){
    x = x+2;
    y = y+2;
}

}
