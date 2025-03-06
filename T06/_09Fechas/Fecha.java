package T06._09Fechas;

import java.util.Date;

public class Fecha {
    private Date fechaNecimiento;
   
    public Fecha(int año, int mes, int día){
        this.fechaNecimiento = new Date(año, mes, día);
    }
}
