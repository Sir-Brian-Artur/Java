package T06.Biblioteca;

public class Main {
public static void main(String[] args) {
    EjemplarLibro libro1 = new EjemplarLibro("Constitución española");
    EjemplarLibro libro2 = new EjemplarLibro("Señor de los anillos");
    EjemplarLibro libro3 = new EjemplarLibro(libro1);
    EjemplarLibro libro4 = new EjemplarLibro(libro3);

    libro4.prestar();
    libro4.valores();
    libro2.valores();
}
}
