public class MetodosCadenas {
    static void main() {
        var cadena1 = "Hola Mundo";

        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        // Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Convertir a mayus y minus
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        System.out.println("minusculas = " + cadena1.toLowerCase());

        // Eliminar espacios
        var cadena2 = "  Leo Reyes    ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());


    }
}
