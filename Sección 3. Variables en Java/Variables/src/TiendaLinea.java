public class TiendaLinea {
    static void main() {
        System.out.println("*** Tienda en linea (detalle producto) ***");
        String nombreProducto = "Papas";
        double precio = 27.50;
        int cantidadDisponible = 14;
        boolean esDisponible = true;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("esDisponible = " + esDisponible);

        nombreProducto = "Galletas";
        precio = 30.00;
        cantidadDisponible = 0;
        esDisponible = false;

        System.out.println();
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("esDisponible = " + esDisponible);
    }
}
