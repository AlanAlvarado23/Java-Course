public class TipoVar {
    static void main() {
        // Sin el uso de var
        String nombre1 = "Alan Alvarado";
        System.out.println("nombre1 = " + nombre1);

        // Con el uso de var
        var nombre2 = "Ricardo Ahedo";
        System.out.println("nombre2 = " + nombre2);

        // Otras variables
        var edad = 20;
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; // Se infiere el tipo float (por la F)
        System.out.println("sueldo = " + sueldo);
        var esCasado = false; // Se infiere de tipo boolean
        esCasado = true;
        System.out.println("esCasado = " + esCasado);

        // Se debe definir su valor
        // var precio; No se puede

        // Se debe poder inferir el tipo de dato
        // var apellido = null; Tampoco se puede inferir
    }
}
