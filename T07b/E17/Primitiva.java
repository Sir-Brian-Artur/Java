package T07b.E17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Primitiva {
    static ArrayList <Integer> sorteo;

    //Constructor y genero papeleta
    public Primitiva(){
        sorteo = new ArrayList<>();
        generador();
    }
    //Generador
    private void generador(){
        int num = 0;
        for(int i = 0; i < 6 ; i++){
            do {
                num = (int) (Math.random()*48) +1;
            } while (sorteo.contains(num));
            sorteo.add(num);
        }
        Collections.sort(sorteo);
    }

    public int comprobarAciertos(ArrayList <Integer> boleto) {
        int num = 0;
        for (int i = 0; i < 6; i++) {
            if (sorteo.contains(boleto.get(i))) num++;
        }
        return num;
    }
    private void generador2 (){
        int num = 0;
        for(int i = 0; i < 6 ; i++){
            do {
                num = (int) (Math.random()*48) +1;
            } while (sorteo.contains(num));
            sorteo.add(num);
        }
        Collections.sort(sorteo);
    }

    private ArrayList <Integer> boletoAzar() {
        ArrayList <Integer> boleto = new ArrayList<>();

        for(int i = 0 ; i < 6 ; i++) {
            Random r = new Random();
            boolean distinto;
            do { 
                distinto = false;
                int newNum = r.nextInt(48) + 1;
                if(!boleto.contains(newNum)){
                    distinto = true;
                    boleto.add(newNum);
                }
            } while (!distinto);
        };
        return boleto;
    }

    public int jugarMilBoletos(){
        int cont, premiado = 0;
        for (int i = 0; i < 1000; i++) {
            cont = 0;
            ArrayList <Integer> bolAle = boletoAzar();
            for (int j = 0; j < 6; j++) {
                if (sorteo.contains(bolAle.get(j))) cont++;
            }
            if(cont >= 3) premiado++;            
        }
        return premiado;
    }

    public int jugarHastaGanar(){
        int cont, premiado = 0, intento = 0;
        do{
            intento++;
            cont = 0;
            ArrayList <Integer> bolAle = boletoAzar();
            for (int j = 0; j < bolAle.size(); j++) {
                if (sorteo.contains(bolAle.get(j))) cont++;
            }
            if(cont >= 3) premiado++;            
        } while (premiado < 6);
        return intento;
    }
}
