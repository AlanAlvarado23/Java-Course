public class ReemplazarSubcadenas {
    static void main() {
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        // Reemplazar
        var nuevaCadena = cadena1.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Reemplazar "Hola"
        nuevaCadena = cadena1.replace("Hola", "Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
