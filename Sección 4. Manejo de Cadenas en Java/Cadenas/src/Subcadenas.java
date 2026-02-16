public class Subcadenas {
    static void main() {
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        // Subcadena 1
        var subcadena1 = cadena1.substring(0, 4);
        System.out.println("subcadena1 = " + subcadena1);

        // Subcadena 2
        var subcadena2 = cadena1.substring(5); // O: (5, 10);
        System.out.println("subcadena2 = " + subcadena2);

    }
}
