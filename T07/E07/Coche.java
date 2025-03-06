package T07.E07;

import java.time.LocalDateTime;

public class Coche {
    public String matricula;
    public LocalDateTime horaLlegada;
    public double importePagar;

    public Coche(String mat){
        matricula = mat;
        horaLlegada = LocalDateTime.now();
        importePagar = 0;
    }

}
