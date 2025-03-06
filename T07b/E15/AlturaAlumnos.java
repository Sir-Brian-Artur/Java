package T07b.E15;

import java.util.ArrayList;
import java.util.Collections;

public class AlturaAlumnos {
    private ArrayList <Double> altura;

    AlturaAlumnos (){
        altura = new ArrayList<>();
    }

    public boolean añadirAltura(double alt){
        if (alt >= 0.5 && alt <= 2.5) {
            altura.add(alt);
            Collections.sort(altura);
            return true;
        }
        return false;
    }

    public ArrayList<Double> mostrarLista(){
        return this.altura;
    }

    public boolean eliminarPosicion(int pos){
        Double res;
        if (pos >= 0 & pos < altura.size()) {
            res = altura.remove(pos);
             if (res != null) return true;
        }
        return false;
    }

    public int eliminarValor(double alt){
        int cont = 0;
        while (altura.contains(alt)) {
            altura.remove(alt);
            cont++;   
        }
        return cont;
    }

    public void vaciarLista(){
        altura.clear();
    }
}
