package T06._17_Contacto;

import java.time.*;

public class Contacto {
    public String nombre;
    public long numero;
    public LocalDate fechaAltaAgenda;

    Contacto(String no, long nu, LocalDate fe) {
        this.nombre = no;
        this.numero = nu;
        this.fechaAltaAgenda = fe;
    }

    Contacto(String no, long nu, String fe) {
        this.nombre = no;
        this.numero = nu;
        this.fechaAltaAgenda = LocalDate.parse(fe);
    }

    Contacto(String no, long nu) {
        this.nombre = no;
        this.numero = nu;
        this.fechaAltaAgenda = LocalDate.now();
    }

}
