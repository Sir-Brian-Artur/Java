package T06.Biblioteca;

import java.time.LocalDate;

public class EjemplarLibro {
    private String titulo;
    private LocalDate fechaAdquisicion;
    private int numEjemplar;
    private boolean prestado;

    public EjemplarLibro(String titulo) {
        this.titulo = titulo;
        numEjemplar = 1;
        fechaAdquisicion = LocalDate.now();
        this.prestado = false;
    }

    public EjemplarLibro(EjemplarLibro libro) {
        this.titulo = libro.titulo;
        this.numEjemplar = libro.numEjemplar + 1;
        this.fechaAdquisicion = libro.fechaAdquisicion; 
        this.prestado = libro.prestado;
    }

    public boolean prestar() {
        if (prestado == false) {
            prestado = true;
            numEjemplar--;
            return true;
        }    
        return false; 
    }

    public boolean devolver() {
        if (prestado){
            prestado = false;
            numEjemplar++;
            return true;
        }
        return false;
    } 

    public void valores() {
        System.out.println(titulo + " " + fechaAdquisicion + " " + numEjemplar);
    }

}
