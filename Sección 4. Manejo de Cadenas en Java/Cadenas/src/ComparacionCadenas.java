public class ComparacionCadenas {
    static void main() {
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        // Comparar cadenas (==)
        System.out.println("cadena 1 es igual en referencia a cadena2");
        System.out.println(cadena1 == cadena2);

        System.out.println("cadena 1 es igual en referencia a cadena3");
        System.out.println(cadena1 == cadena3);

        // Comparar contenido usar metodo equals
        System.out.println("cadena1 es igual en contenido a cadena3");
        System.out.println(cadena1.equals(cadena3));
    }
}
