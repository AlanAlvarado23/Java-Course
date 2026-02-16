public class DetalleLibro {
    static void main() {
        // Detalle de un libro
        String titulo_libro = "El señor de los anillos";
        int anio_publicacion = 1954;
        boolean libro_disponible = true;
        double precio = 500.50;

        // Imprimir valores
        System.out.println(titulo_libro);
        System.out.println(anio_publicacion);
        System.out.println(libro_disponible);
        System.out.println(precio);

        // Modificar titulo del libro
        titulo_libro = "El Señor de los Anillos";
        System.out.println(titulo_libro);
    }
}
