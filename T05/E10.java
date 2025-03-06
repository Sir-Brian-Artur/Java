package T05;            //Muestra "Ya tienes más de 1000 euros" 900.0 porque al hacer
                        //la comprobación, ya está cambiando el valor se saldo; 
public class E10 {      //pero sólo dentro de la condición.
    public static void main(String[] args) {
        float saldo = 500f;
        saldo = ingresar(saldo, 400f);
        if (ingresar(saldo, 400f) > 1000f)
            System.out.println("Ya tienes más de 1000 euros: " + saldo);
        else
            System.out.println("No tienes más de 1000 euros: " + saldo);
    }

    static float ingresar(float saldo, float increm) {
        return saldo + increm;
    }
}