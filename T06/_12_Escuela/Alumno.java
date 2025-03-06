package T06._12_Escuela;

// Import del tipo LocalDate
import java.time.LocalDate;

public class Alumno {
    // Atributos privados
    private String nombre;
    private String dni;
    private LocalDate fechaNacimiento;
    private String escuela;

    // Constructor
    public Alumno(){
        escuela = "San Nicolás";
    }

    // Getters & Setters de los atributos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(int y, int m, int d) {
        this.fechaNacimiento = LocalDate.of(y, m, d);
    }
    public String getEscuela() {
        return escuela;
    }

    // Metodos propios
    public boolean mayorEdad(){
        return this.fechaNacimiento.isBefore(LocalDate.now().minusYears(18));
    }

    public boolean mayorAlumno(Alumno alumno) {
        return this.fechaNacimiento.isBefore(alumno.fechaNacimiento);
    }

    public boolean igualAlumno(Alumno alumno) {
        return this.fechaNacimiento == alumno.fechaNacimiento && this.nombre == alumno.nombre && this.dni == alumno.dni;
    }
}
