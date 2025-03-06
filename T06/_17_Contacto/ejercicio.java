package T06._17_Contacto;

import java.time.*;

public class ejercicio {

    public static void main(String[] args) {
        Contacto contacto;
        contacto = new Contacto("Marta", 6661111222L, LocalDate.parse("2019-11-25"));
        contacto = new Contacto ("Miguel", 1111111L, LocalDate.now()); 
        contacto = new Contacto ("Ana", 3333333L,"2019-11-20"); 
        contacto = new Contacto ("Daniel", 444444L);
    }
}
